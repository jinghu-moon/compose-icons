package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorThinIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.13f, 60.21f),
                    PathNode.LineTo(60.21f, 190.13f),
                    PathNode.CurveTo(54.227325f, 183.61682f, 49.215694f, 176.2745f, 45.33f, 168.33f),
                    PathNode.LineTo(168.33f, 45.33f),
                    PathNode.CurveTo(176.2745f, 49.215694f, 183.61682f, 54.227325f, 190.13f, 60.21f),
                    PathNode.Close,
                    PathNode.MoveTo(195.79f, 65.87f),
                    PathNode.CurveTo(201.7694f, 72.38578f, 206.78069f, 79.72759f, 210.67f, 87.67f),
                    PathNode.LineTo(87.67f, 210.67f),
                    PathNode.CurveTo(79.72759f, 206.78069f, 72.38578f, 201.7694f, 65.87f, 195.79f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(139.07884f, 35.988255f, 150.06752f, 37.990814f, 160.43f, 41.91f),
                    PathNode.LineTo(41.91f, 160.43f),
                    PathNode.CurveTo(31.26549f, 132.17111f, 35.16641f, 100.48774f, 52.347687f, 75.654816f),
                    PathNode.CurveTo(69.52896f, 50.82189f, 97.80281f, 36.001537f, 128.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(116.92116f, 220.01175f, 105.93248f, 218.00919f, 95.57f, 214.09f),
                    PathNode.LineTo(214.09f, 95.57f),
                    PathNode.CurveTo(224.73451f, 123.82889f, 220.83359f, 155.51225f, 203.65231f, 180.34518f),
                    PathNode.CurveTo(186.47104f, 205.1781f, 158.19719f, 219.99846f, 128.0f, 220.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _boules!!
    }

private var _boules: ImageVector? = null
