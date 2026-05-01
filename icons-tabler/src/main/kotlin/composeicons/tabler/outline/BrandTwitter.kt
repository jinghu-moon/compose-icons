package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTwitter: ImageVector
    get() {
        if (_brandTwitter != null) return _brandTwitter!!
        _brandTwitter = tablerOutlineIcon(
            name = "BrandTwitter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 4.01f),
                    PathNode.CurveTo(21.0f, 4.5f, 20.02f, 4.699f, 19.0f, 5.0f),
                    PathNode.CurveTo(17.879f, 3.735f, 16.217f, 3.665f, 14.62f, 4.263f),
                    PathNode.CurveTo(13.023f, 4.861f, 11.977f, 6.323f, 12.0f, 8.0f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.CurveTo(8.755f, 9.083f, 5.865f, 7.605f, 4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 5.0f, -0.182f, 12.433f, 8.0f, 16.0f),
                    PathNode.CurveTo(6.128f, 17.247f, 4.261f, 18.088f, 2.0f, 18.0f),
                    PathNode.CurveTo(5.308f, 19.803f, 8.913f, 20.423f, 12.034f, 19.517f),
                    PathNode.CurveTo(15.614f, 18.477f, 18.556f, 15.794f, 19.685f, 11.775f),
                    PathNode.CurveTo(20.02179f, 10.55267f, 20.18902f, 9.28986f, 20.182f, 8.022001f),
                    PathNode.CurveTo(20.182f, 7.773f, 21.692f, 5.25f, 22.0f, 4.009f),
                    PathNode.LineTo(22.0f, 4.01f)
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
        return _brandTwitter!!
    }

private var _brandTwitter: ImageVector? = null
