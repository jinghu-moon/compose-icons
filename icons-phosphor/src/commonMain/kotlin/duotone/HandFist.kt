package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandFist: ImageVector
    get() {
        if (_handFist != null) return _handFist!!
        _handFist = phosphorDuotoneIcon(
            name = "HandFist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 112.0f),
                    PathNode.LineTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(74.98067f, 224.0f, 32.0f, 181.01933f, 32.0f, 128.0f),
                    PathNode.LineTo(32.0f, 88.0f),
                    PathNode.CurveTo(32.0f, 74.74516f, 42.745167f, 64.0f, 56.0f, 64.0f),
                    PathNode.CurveTo(69.25484f, 64.0f, 80.0f, 74.74516f, 80.0f, 88.0f),
                    PathNode.LineTo(80.0f, 64.0f),
                    PathNode.CurveTo(80.0f, 50.745167f, 90.74516f, 40.0f, 104.0f, 40.0f),
                    PathNode.CurveTo(117.25484f, 40.0f, 128.0f, 50.745167f, 128.0f, 64.0f),
                    PathNode.CurveTo(128.0f, 50.745167f, 138.74516f, 40.0f, 152.0f, 40.0f),
                    PathNode.CurveTo(165.25484f, 40.0f, 176.0f, 50.745167f, 176.0f, 64.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.CurveTo(213.25484f, 88.0f, 224.0f, 98.74516f, 224.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 80.0f),
                    PathNode.LineTo(184.0f, 80.0f),
                    PathNode.LineTo(184.0f, 64.0f),
                    PathNode.CurveTo(183.98505f, 50.697956f, 175.74246f, 38.79235f, 163.29688f, 34.096367f),
                    PathNode.CurveTo(150.8513f, 29.400381f, 136.79848f, 32.89345f, 128.0f, 42.87f),
                    PathNode.CurveTo(119.63304f, 33.38679f, 106.46586f, 29.72083f, 94.40205f, 33.515778f),
                    PathNode.CurveTo(82.33823f, 37.310722f, 73.641075f, 47.8546f, 72.21f, 60.42f),
                    PathNode.CurveTo(62.317043f, 54.607677f, 50.069366f, 54.53691f, 40.109905f, 60.234528f),
                    PathNode.CurveTo(30.15044f, 65.93214f, 24.003765f, 76.525955f, 24.0f, 88.0f),
                    PathNode.LineTo(24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.LineTo(232.0f, 112.0f),
                    PathNode.CurveTo(232.0f, 94.32689f, 217.67311f, 80.0f, 200.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 48.0f),
                    PathNode.CurveTo(160.83656f, 48.0f, 168.0f, 55.163445f, 168.0f, 64.0f),
                    PathNode.LineTo(168.0f, 80.0f),
                    PathNode.LineTo(136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.CurveTo(136.0f, 55.163445f, 143.16344f, 48.0f, 152.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 64.0f),
                    PathNode.CurveTo(88.0f, 55.163445f, 95.163445f, 48.0f, 104.0f, 48.0f),
                    PathNode.CurveTo(112.836555f, 48.0f, 120.0f, 55.163445f, 120.0f, 64.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 112.836555f, 112.836555f, 120.0f, 104.0f, 120.0f),
                    PathNode.CurveTo(95.163445f, 120.0f, 88.0f, 112.836555f, 88.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 88.0f),
                    PathNode.CurveTo(40.0f, 79.163445f, 47.163445f, 72.0f, 56.0f, 72.0f),
                    PathNode.CurveTo(64.836555f, 72.0f, 72.0f, 79.163445f, 72.0f, 88.0f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.CurveTo(72.0f, 112.836555f, 64.836555f, 120.0f, 56.0f, 120.0f),
                    PathNode.CurveTo(47.163445f, 120.0f, 40.0f, 112.836555f, 40.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(215.99919f, 175.86963f, 177.73419f, 214.95836f, 129.87543f, 215.97853f),
                    PathNode.CurveTo(82.01666f, 216.99872f, 42.120705f, 179.57611f, 40.08f, 131.75f),
                    PathNode.CurveTo(53.264942f, 139.33305f, 69.96853f, 136.56306f, 80.0f, 125.13f),
                    PathNode.CurveTo(91.46919f, 138.19849f, 111.28656f, 139.68768f, 124.58f, 128.48f),
                    PathNode.CurveTo(127.45792f, 133.24956f, 131.5236f, 137.1912f, 136.38f, 139.92f),
                    PathNode.CurveTo(125.966225f, 149.01717f, 119.99391f, 162.1723f, 120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 180.41827f, 123.58172f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(132.41827f, 184.0f, 136.0f, 180.41827f, 136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 158.32689f, 150.32689f, 144.0f, 168.0f, 144.0f),
                    PathNode.CurveTo(172.41827f, 144.0f, 176.0f, 140.41827f, 176.0f, 136.0f),
                    PathNode.CurveTo(176.0f, 131.58173f, 172.41827f, 128.0f, 168.0f, 128.0f),
                    PathNode.LineTo(152.0f, 128.0f),
                    PathNode.CurveTo(143.16344f, 128.0f, 136.0f, 120.836555f, 136.0f, 112.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.CurveTo(208.83656f, 96.0f, 216.0f, 103.163445f, 216.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handFist!!
    }

private var _handFist: ImageVector? = null
