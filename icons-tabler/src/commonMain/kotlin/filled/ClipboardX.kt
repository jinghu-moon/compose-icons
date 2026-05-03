package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClipboardX: ImageVector
    get() {
        if (_clipboardX != null) return _clipboardX!!
        _clipboardX = tablerFilledIcon(
            name = "ClipboardX",
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
                    PathNode.MoveTo(10.707f, 11.293f),
                    PathNode.CurveTo(10.3165f, 10.902618f, 9.6835f, 10.902618f, 9.293f, 11.293f),
                    PathNode.LineTo(9.21f, 11.387f),
                    PathNode.CurveTo(8.901197f, 11.785086f, 8.936765f, 12.350732f, 9.293f, 12.707f),
                    PathNode.LineTo(10.585f, 14.0f),
                    PathNode.LineTo(9.293f, 15.293f),
                    PathNode.CurveTo(8.902618f, 15.6835f, 8.902618f, 16.3165f, 9.293f, 16.707f),
                    PathNode.LineTo(9.387f, 16.79f),
                    PathNode.CurveTo(9.785086f, 17.098803f, 10.350732f, 17.063234f, 10.707f, 16.707f),
                    PathNode.LineTo(12.0f, 15.414f),
                    PathNode.LineTo(13.293f, 16.707f),
                    PathNode.CurveTo(13.6835f, 17.097382f, 14.3165f, 17.097382f, 14.707f, 16.707f),
                    PathNode.LineTo(14.79f, 16.613f),
                    PathNode.CurveTo(15.098803f, 16.214914f, 15.063235f, 15.649268f, 14.707f, 15.293f),
                    PathNode.LineTo(13.414f, 14.0f),
                    PathNode.LineTo(14.707f, 12.707f),
                    PathNode.CurveTo(15.097382f, 12.3165f, 15.097382f, 11.6835f, 14.707f, 11.293f),
                    PathNode.LineTo(14.613f, 11.21f),
                    PathNode.CurveTo(14.214914f, 10.901197f, 13.649268f, 10.936765f, 13.293f, 11.293f),
                    PathNode.LineTo(12.0f, 12.585f),
                    PathNode.Close,
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
        return _clipboardX!!
    }

private var _clipboardX: ImageVector? = null
