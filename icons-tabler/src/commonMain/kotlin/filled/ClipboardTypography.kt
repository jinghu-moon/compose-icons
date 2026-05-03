package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClipboardTypography: ImageVector
    get() {
        if (_clipboardTypography != null) return _clipboardTypography!!
        _clipboardTypography = tablerFilledIcon(
            name = "ClipboardTypography",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.997f, 4.17f),
                    PathNode.CurveTo(19.197367f, 4.592963f, 20.000217f, 5.727295f, 20.0f, 7.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.656855f, 18.656855f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.CurveTo(3.999782f, 5.727295f, 4.802633f, 4.592963f, 6.003f, 4.17f),
                    PathNode.CurveTo(6.094089f, 6.31132f, 7.856744f, 8.000329f, 10.0f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(16.053223f, 8.000181f, 17.773138f, 6.445776f, 17.98f, 4.403f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.CurveTo(8.447715f, 10.0f, 8.0f, 10.447715f, 8.0f, 11.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 12.552285f, 8.447715f, 13.0f, 9.0f, 13.0f),
                    PathNode.CurveTo(9.552285f, 13.0f, 10.0f, 12.552285f, 10.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.CurveTo(10.447715f, 16.0f, 10.0f, 16.447716f, 10.0f, 17.0f),
                    PathNode.CurveTo(10.0f, 17.552284f, 10.447715f, 18.0f, 11.0f, 18.0f),
                    PathNode.LineTo(13.0f, 18.0f),
                    PathNode.CurveTo(13.552285f, 18.0f, 14.0f, 17.552284f, 14.0f, 17.0f),
                    PathNode.CurveTo(14.0f, 16.447716f, 13.552285f, 16.0f, 13.0f, 16.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 12.552285f, 14.447715f, 13.0f, 15.0f, 13.0f),
                    PathNode.CurveTo(15.552285f, 13.0f, 16.0f, 12.552285f, 16.0f, 12.0f),
                    PathNode.LineTo(16.0f, 11.0f),
                    PathNode.CurveTo(16.0f, 10.447715f, 15.552285f, 10.0f, 15.0f, 10.0f),
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(15.104569f, 2.0f, 16.0f, 2.895431f, 16.0f, 4.0f),
                    PathNode.CurveTo(16.0f, 5.10457f, 15.104569f, 6.0f, 14.0f, 6.0f),
                    PathNode.LineTo(10.0f, 6.0f),
                    PathNode.CurveTo(8.895431f, 6.0f, 8.0f, 5.10457f, 8.0f, 4.0f),
                    PathNode.CurveTo(8.0f, 2.895431f, 8.895431f, 2.0f, 10.0f, 2.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _clipboardTypography!!
    }

private var _clipboardTypography: ImageVector? = null
