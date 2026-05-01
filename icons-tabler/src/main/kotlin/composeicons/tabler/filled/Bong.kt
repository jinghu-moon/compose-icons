package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bong: ImageVector
    get() {
        if (_bong != null) return _bong!!
        _bong = tablerFilledIcon(
            name = "Bong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(14.552285f, 2.0f, 15.0f, 2.447715f, 15.0f, 3.0f),
                    PathNode.CurveTo(15.0f, 3.552285f, 14.552285f, 4.0f, 14.0f, 4.0f),
                    PathNode.LineTo(14.0f, 9.587f),
                    PathNode.LineTo(16.293f, 7.293f),
                    PathNode.CurveTo(16.64927f, 6.936765f, 17.214914f, 6.901198f, 17.613f, 7.21f),
                    PathNode.LineTo(17.707f, 7.293f),
                    PathNode.LineTo(19.707f, 9.293f),
                    PathNode.CurveTo(20.097382f, 9.6835f, 20.097382f, 10.3165f, 19.707f, 10.707f),
                    PathNode.LineTo(16.591f, 13.822f),
                    PathNode.LineTo(16.677f, 14.055f),
                    PathNode.CurveTo(16.988f, 14.962f, 17.073f, 15.92f, 16.94f, 16.849f),
                    PathNode.LineTo(16.878f, 17.209f),
                    PathNode.LineTo(16.866f, 17.261f),
                    PathNode.CurveTo(16.677206f, 18.138037f, 16.29414f, 18.961576f, 15.745f, 19.671f),
                    PathNode.LineTo(15.585f, 19.87f),
                    PathNode.CurveTo(14.136526f, 21.585688f, 11.851323f, 22.34904f, 9.662492f, 21.848362f),
                    PathNode.CurveTo(7.473661f, 21.347685f, 5.747562f, 19.66678f, 5.189f, 17.492f),
                    PathNode.LineTo(5.121f, 17.204f),
                    PathNode.LineTo(5.112f, 17.158f),
                    PathNode.CurveTo(4.620566f, 14.662621f, 5.755786f, 12.128513f, 7.945f, 10.834f),
                    PathNode.LineTo(8.0f, 10.803f),
                    PathNode.LineTo(8.0f, 4.0f),
                    PathNode.CurveTo(7.447716f, 4.0f, 7.0f, 3.552285f, 7.0f, 3.0f),
                    PathNode.CurveTo(7.0f, 2.447715f, 7.447716f, 2.0f, 8.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.LineTo(10.0f, 11.416f),
                    PathNode.CurveTo(10.000005f, 11.766227f, 9.816789f, 12.090933f, 9.517f, 12.272f),
                    PathNode.LineTo(9.4f, 12.332f),
                    PathNode.CurveTo(7.941648f, 12.968477f, 6.999229f, 14.408808f, 7.0f, 16.0f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.CurveTo(15.000506f, 15.331409f, 14.833414f, 14.673357f, 14.514f, 14.086f),
                    PathNode.CurveTo(14.301861f, 13.696962f, 14.371045f, 13.214707f, 14.684f, 12.901f),
                    PathNode.LineTo(17.586f, 10.0f),
                    PathNode.LineTo(17.0f, 9.414f),
                    PathNode.LineTo(14.1f, 12.316f),
                    PathNode.CurveTo(13.820333f, 12.595732f, 13.402061f, 12.684325f, 13.033f, 12.542f),
                    PathNode.LineTo(12.913f, 12.486f),
                    PathNode.CurveTo(12.809992f, 12.429722f, 12.704556f, 12.378005f, 12.597f, 12.331f),
                    PathNode.CurveTo(12.23425f, 12.171267f, 12.000079f, 11.812361f, 12.0f, 11.416f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bong!!
    }

private var _bong: ImageVector? = null
