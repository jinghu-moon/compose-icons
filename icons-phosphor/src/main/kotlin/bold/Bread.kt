package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorBoldIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 80.0f),
                    PathNode.CurveTo(243.97244f, 55.71089f, 224.28911f, 36.027554f, 200.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(27.67822f, 36.01972f, 10.013591f, 49.95397f, 5.26223f, 69.7125f),
                    PathNode.CurveTo(0.510869f, 89.47104f, 9.908979f, 109.91311f, 28.0f, 119.17f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 211.0457f, 36.954304f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(211.0457f, 220.0f, 220.0f, 211.0457f, 220.0f, 200.0f),
                    PathNode.LineTo(220.0f, 119.17f),
                    PathNode.CurveTo(234.72188f, 111.65728f, 243.99179f, 96.52799f, 244.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 123.3f),
                    PathNode.CurveTo(57.489468f, 121.338196f, 60.774933f, 115.715f, 59.788593f, 109.96956f),
                    PathNode.CurveTo(58.802246f, 104.22411f, 53.82946f, 100.018654f, 48.0f, 100.0f),
                    PathNode.CurveTo(36.954304f, 100.0f, 28.0f, 91.04569f, 28.0f, 80.0f),
                    PathNode.CurveTo(28.0f, 68.95431f, 36.954304f, 60.0f, 48.0f, 60.0f),
                    PathNode.LineTo(140.0f, 60.0f),
                    PathNode.CurveTo(151.0457f, 60.0f, 160.0f, 68.95431f, 160.0f, 80.0f),
                    PathNode.CurveTo(160.0f, 91.04569f, 151.0457f, 100.0f, 140.0f, 100.0f),
                    PathNode.CurveTo(134.17053f, 100.018654f, 129.19775f, 104.22411f, 128.21141f, 109.96956f),
                    PathNode.CurveTo(127.22507f, 115.715f, 130.51053f, 121.338196f, 136.0f, 123.3f),
                    PathNode.LineTo(136.0f, 196.0f),
                    PathNode.LineTo(52.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 100.0f),
                    PathNode.CurveTo(194.17053f, 100.018654f, 189.19775f, 104.22411f, 188.21141f, 109.96956f),
                    PathNode.CurveTo(187.22507f, 115.715f, 190.51053f, 121.338196f, 196.0f, 123.3f),
                    PathNode.LineTo(196.0f, 196.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.LineTo(160.0f, 119.17f),
                    PathNode.CurveTo(170.40024f, 113.87777f, 178.26683f, 104.664215f, 181.86342f, 93.56299f),
                    PathNode.CurveTo(185.46002f, 82.46176f, 184.4909f, 70.3856f, 179.17f, 60.0f),
                    PathNode.LineTo(200.0f, 60.0f),
                    PathNode.CurveTo(211.0457f, 60.0f, 220.0f, 68.95431f, 220.0f, 80.0f),
                    PathNode.CurveTo(220.0f, 91.04569f, 211.0457f, 100.0f, 200.0f, 100.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bread!!
    }

private var _bread: ImageVector? = null
