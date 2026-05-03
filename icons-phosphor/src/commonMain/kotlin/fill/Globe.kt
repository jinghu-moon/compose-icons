package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = phosphorFillIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.LineTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93387f, 70.5898f, 185.4102f, 24.066128f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.36f, 88.0f),
                    PathNode.LineTo(170.71f, 88.0f),
                    PathNode.CurveTo(166.22054f, 71.529076f, 158.65402f, 56.05675f, 148.41f, 42.4f),
                    PathNode.CurveTo(173.45708f, 48.416927f, 194.62726f, 65.07256f, 206.37f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.00696f, 136.11562f, 214.88625f, 144.19284f, 212.67f, 152.0f),
                    PathNode.LineTo(174.16f, 152.0f),
                    PathNode.CurveTo(176.61336f, 136.09402f, 176.61336f, 119.90595f, 174.16f, 104.0f),
                    PathNode.LineTo(212.67f, 104.0f),
                    PathNode.CurveTo(214.88625f, 111.80715f, 216.00696f, 119.88438f, 216.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 43.0f),
                    PathNode.CurveTo(139.97923f, 55.825203f, 148.8719f, 71.216354f, 154.0f, 88.0f),
                    PathNode.LineTo(102.0f, 88.0f),
                    PathNode.CurveTo(107.12289f, 71.21409f, 116.0162f, 55.821823f, 128.0f, 43.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 168.0f),
                    PathNode.LineTo(154.0f, 168.0f),
                    PathNode.CurveTo(148.87712f, 184.7859f, 139.98381f, 200.17818f, 128.0f, 213.0f),
                    PathNode.CurveTo(116.02076f, 200.17479f, 107.1281f, 184.78365f, 102.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.1f, 152.0f),
                    PathNode.CurveTo(95.35342f, 136.11787f, 95.35342f, 119.882126f, 98.1f, 104.0f),
                    PathNode.LineTo(157.98f, 104.0f),
                    PathNode.CurveTo(160.72658f, 119.882126f, 160.72658f, 136.11787f, 157.98f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.45f, 213.6f),
                    PathNode.CurveTo(158.69402f, 199.94325f, 166.26053f, 184.47092f, 170.75f, 168.0f),
                    PathNode.LineTo(206.41f, 168.0f),
                    PathNode.CurveTo(194.65855f, 190.93655f, 173.47202f, 207.59357f, 148.41f, 213.6f),
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
        return _globe!!
    }

private var _globe: ImageVector? = null
