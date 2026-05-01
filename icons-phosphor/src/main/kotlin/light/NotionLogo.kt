package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = phosphorLightIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 42.0f),
                    PathNode.LineTo(168.0f, 42.0f),
                    PathNode.CurveTo(164.6863f, 42.0f, 162.0f, 44.68629f, 162.0f, 48.0f),
                    PathNode.CurveTo(162.0f, 51.31371f, 164.6863f, 54.0f, 168.0f, 54.0f),
                    PathNode.LineTo(186.0f, 54.0f),
                    PathNode.LineTo(186.0f, 184.64f),
                    PathNode.LineTo(109.26f, 45.11f),
                    PathNode.CurveTo(108.20542f, 43.191277f, 106.18944f, 41.999317f, 104.0f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(36.68629f, 42.0f, 34.0f, 44.68629f, 34.0f, 48.0f),
                    PathNode.CurveTo(34.0f, 51.31371f, 36.68629f, 54.0f, 40.0f, 54.0f),
                    PathNode.LineTo(58.0f, 54.0f),
                    PathNode.LineTo(58.0f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(36.68629f, 202.0f, 34.0f, 204.6863f, 34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 211.3137f, 36.68629f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(88.0f, 214.0f),
                    PathNode.CurveTo(91.313705f, 214.0f, 94.0f, 211.3137f, 94.0f, 208.0f),
                    PathNode.CurveTo(94.0f, 204.6863f, 91.313705f, 202.0f, 88.0f, 202.0f),
                    PathNode.LineTo(70.0f, 202.0f),
                    PathNode.LineTo(70.0f, 71.36f),
                    PathNode.LineTo(146.74f, 210.89f),
                    PathNode.CurveTo(147.79459f, 212.80872f, 149.81056f, 214.00069f, 152.0f, 214.0f),
                    PathNode.LineTo(192.0f, 214.0f),
                    PathNode.CurveTo(195.3137f, 214.0f, 198.0f, 211.3137f, 198.0f, 208.0f),
                    PathNode.LineTo(198.0f, 54.0f),
                    PathNode.LineTo(216.0f, 54.0f),
                    PathNode.CurveTo(219.3137f, 54.0f, 222.0f, 51.31371f, 222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 44.68629f, 219.3137f, 42.0f, 216.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.15f, 54.0f),
                    PathNode.LineTo(100.45f, 54.0f),
                    PathNode.LineTo(181.85f, 202.0f),
                    PathNode.LineTo(155.55f, 202.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _notionLogo!!
    }

private var _notionLogo: ImageVector? = null
