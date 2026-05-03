package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GlobeX: ImageVector
    get() {
        if (_globeX != null) return _globeX!!
        _globeX = phosphorFillIcon(
            name = "GlobeX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(131.37875f, 231.98174f, 134.38173f, 229.84271f, 135.5032f, 226.65546f),
                    PathNode.CurveTo(136.6247f, 223.4682f, 135.62285f, 219.92001f, 133.0f, 217.79f),
                    PathNode.LineTo(133.0f, 217.79f),
                    PathNode.CurveTo(131.88f, 216.88f, 112.12f, 200.47f, 101.94f, 168.02f),
                    PathNode.LineTo(127.94f, 168.02f),
                    PathNode.CurveTo(132.35828f, 168.02f, 135.94f, 164.43828f, 135.94f, 160.02f),
                    PathNode.CurveTo(135.94f, 155.60172f, 132.35828f, 152.02f, 127.94f, 152.02f),
                    PathNode.LineTo(98.08f, 152.02f),
                    PathNode.CurveTo(95.32009f, 136.13902f, 95.32009f, 119.900986f, 98.08f, 104.02f),
                    PathNode.LineTo(157.96f, 104.02f),
                    PathNode.CurveTo(159.33704f, 111.938675f, 160.01962f, 119.96251f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 132.41827f, 163.58173f, 136.0f, 168.0f, 136.0f),
                    PathNode.CurveTo(172.41827f, 136.0f, 176.0f, 132.41827f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.01093f, 119.964355f, 175.39572f, 111.94007f, 174.16f, 104.0f),
                    PathNode.LineTo(212.67f, 104.0f),
                    PathNode.CurveTo(214.88625f, 111.80715f, 216.00696f, 119.88438f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 132.41827f, 219.58173f, 136.0f, 224.0f, 136.0f),
                    PathNode.CurveTo(228.41827f, 136.0f, 232.0f, 132.41827f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 88.0f),
                    PathNode.CurveTo(107.12289f, 71.21409f, 116.0162f, 55.821823f, 128.0f, 43.0f),
                    PathNode.CurveTo(139.97923f, 55.825203f, 148.8719f, 71.216354f, 154.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.75f, 88.0f),
                    PathNode.CurveTo(166.26053f, 71.529076f, 158.69402f, 56.05675f, 148.45f, 42.4f),
                    PathNode.CurveTo(173.51201f, 48.406437f, 194.69856f, 65.06344f, 206.45f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.7f, 173.66f),
                    PathNode.LineTo(203.31f, 192.0f),
                    PathNode.LineTo(221.66f, 210.34f),
                    PathNode.CurveTo(224.78593f, 213.46593f, 224.78593f, 218.53407f, 221.66f, 221.66f),
                    PathNode.CurveTo(218.53407f, 224.78593f, 213.46593f, 224.78593f, 210.34f, 221.66f),
                    PathNode.LineTo(192.0f, 203.31f),
                    PathNode.LineTo(173.66f, 221.66f),
                    PathNode.CurveTo(170.53407f, 224.78593f, 165.46593f, 224.78593f, 162.34f, 221.66f),
                    PathNode.CurveTo(159.21407f, 218.53407f, 159.21407f, 213.46593f, 162.34f, 210.34f),
                    PathNode.LineTo(180.69f, 192.0f),
                    PathNode.LineTo(162.34f, 173.66f),
                    PathNode.CurveTo(159.21407f, 170.53407f, 159.21407f, 165.46593f, 162.34f, 162.34f),
                    PathNode.CurveTo(165.46593f, 159.21407f, 170.53407f, 159.21407f, 173.66f, 162.34f),
                    PathNode.LineTo(192.0f, 180.69f),
                    PathNode.LineTo(210.34f, 162.34f),
                    PathNode.CurveTo(213.46593f, 159.21407f, 218.53407f, 159.21407f, 221.66f, 162.34f),
                    PathNode.CurveTo(224.78593f, 165.46593f, 224.78593f, 170.53407f, 221.66f, 173.66f),
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
        return _globeX!!
    }

private var _globeX: ImageVector? = null
