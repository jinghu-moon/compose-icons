package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGithub: ImageVector
    get() {
        if (_brandGithub != null) return _brandGithub!!
        _brandGithub = tablerOutlineIcon(
            name = "BrandGithub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 19.0f),
                    PathNode.CurveTo(4.7f, 20.4f, 4.7f, 16.5f, 3.0f, 16.0f),
                    PathNode.MoveTo(15.0f, 21.0f),
                    PathNode.LineTo(15.0f, 17.5f),
                    PathNode.CurveTo(15.0f, 16.5f, 15.1f, 16.1f, 14.5f, 15.5f),
                    PathNode.CurveTo(17.3f, 15.2f, 20.0f, 14.1f, 20.0f, 9.5f),
                    PathNode.CurveTo(19.998783f, 8.304964f, 19.532545f, 7.157308f, 18.7f, 6.3f),
                    PathNode.CurveTo(19.090467f, 5.261966f, 19.05452f, 4.111628f, 18.6f, 3.1f),
                    PathNode.CurveTo(18.6f, 3.1f, 17.5f, 2.8f, 15.1f, 4.4f),
                    PathNode.CurveTo(13.067238f, 3.870588f, 10.932762f, 3.870588f, 8.9f, 4.4f),
                    PathNode.CurveTo(6.5f, 2.8f, 5.4f, 3.1f, 5.4f, 3.1f),
                    PathNode.CurveTo(4.945482f, 4.111628f, 4.909533f, 5.261966f, 5.3f, 6.3f),
                    PathNode.CurveTo(4.467453f, 7.157308f, 4.001217f, 8.304964f, 4.0f, 9.5f),
                    PathNode.CurveTo(4.0f, 14.1f, 6.7f, 15.2f, 9.5f, 15.5f),
                    PathNode.CurveTo(8.9f, 16.1f, 8.9f, 16.7f, 9.0f, 17.5f),
                    PathNode.LineTo(9.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandGithub!!
    }

private var _brandGithub: ImageVector? = null
