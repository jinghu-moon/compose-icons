package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClipboardCheck: ImageVector
    get() {
        if (_clipboardCheck != null) return _clipboardCheck!!
        _clipboardCheck = tablerFilledIcon(
            name = "ClipboardCheck",
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
                    PathNode.MoveTo(14.293f, 11.293f),
                    PathNode.LineTo(11.0f, 14.585f),
                    PathNode.LineTo(9.707f, 13.293f),
                    PathNode.CurveTo(9.455926f, 13.033044f, 9.084122f, 12.928787f, 8.734492f, 13.020303f),
                    PathNode.CurveTo(8.384863f, 13.111818f, 8.111819f, 13.384863f, 8.020303f, 13.734492f),
                    PathNode.CurveTo(7.928787f, 14.084122f, 8.033044f, 14.455926f, 8.293f, 14.707f),
                    PathNode.LineTo(10.293f, 16.707f),
                    PathNode.CurveTo(10.6835f, 17.097382f, 11.3165f, 17.097382f, 11.707f, 16.707f),
                    PathNode.LineTo(15.707f, 12.707f),
                    PathNode.CurveTo(16.085972f, 12.314621f, 16.080553f, 11.690915f, 15.694818f, 11.305182f),
                    PathNode.CurveTo(15.309085f, 10.919448f, 14.685379f, 10.914028f, 14.293f, 11.293f),
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
        return _clipboardCheck!!
    }

private var _clipboardCheck: ImageVector? = null
