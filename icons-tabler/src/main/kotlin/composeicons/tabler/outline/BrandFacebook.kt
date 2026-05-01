package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFacebook: ImageVector
    get() {
        if (_brandFacebook != null) return _brandFacebook!!
        _brandFacebook = tablerOutlineIcon(
            name = "BrandFacebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.LineTo(10.0f, 21.0f),
                    PathNode.LineTo(14.0f, 21.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.LineTo(17.0f, 14.0f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(14.0f, 7.447716f, 14.447715f, 7.0f, 15.0f, 7.0f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.CurveTo(12.238576f, 3.0f, 10.0f, 5.238577f, 10.0f, 8.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.LineTo(7.0f, 10.0f)
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
        return _brandFacebook!!
    }

private var _brandFacebook: ImageVector? = null
