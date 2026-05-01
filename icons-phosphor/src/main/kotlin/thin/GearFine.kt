package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GearFine: ImageVector
    get() {
        if (_gearFine != null) return _gearFine!!
        _gearFine = phosphorThinIcon(
            name = "GearFine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 124.0f),
                    PathNode.LineTo(211.9f, 124.0f),
                    PathNode.CurveTo(211.33542f, 111.9754f, 208.17291f, 100.215775f, 202.63f, 89.53f),
                    PathNode.LineTo(220.07f, 79.46f),
                    PathNode.CurveTo(221.87901f, 78.31001f, 222.45992f, 75.938416f, 221.38718f, 74.08256f),
                    PathNode.CurveTo(220.31442f, 72.22671f, 217.9694f, 71.546394f, 216.07f, 72.54f),
                    PathNode.LineTo(198.62f, 82.61f),
                    PathNode.CurveTo(192.10074f, 72.50082f, 183.49919f, 63.89927f, 173.39f, 57.38f),
                    PathNode.LineTo(183.46f, 39.93f),
                    PathNode.CurveTo(184.45361f, 38.030598f, 183.7733f, 35.685574f, 181.91743f, 34.612827f),
                    PathNode.CurveTo(180.06158f, 33.54008f, 177.68999f, 34.12099f, 176.54f, 35.93f),
                    PathNode.LineTo(166.47f, 53.37f),
                    PathNode.CurveTo(155.78423f, 47.827087f, 144.0246f, 44.664577f, 132.0f, 44.1f),
                    PathNode.LineTo(132.0f, 24.0f),
                    PathNode.CurveTo(132.0f, 21.790861f, 130.20914f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(125.79086f, 20.0f, 124.0f, 21.790861f, 124.0f, 24.0f),
                    PathNode.LineTo(124.0f, 44.1f),
                    PathNode.CurveTo(111.9754f, 44.664577f, 100.215775f, 47.827087f, 89.53f, 53.37f),
                    PathNode.LineTo(79.46f, 35.93f),
                    PathNode.CurveTo(78.31001f, 34.12099f, 75.938416f, 33.54008f, 74.08256f, 34.612827f),
                    PathNode.CurveTo(72.22671f, 35.685574f, 71.546394f, 38.030598f, 72.54f, 39.93f),
                    PathNode.LineTo(82.61f, 57.38f),
                    PathNode.CurveTo(72.50082f, 63.89927f, 63.89927f, 72.50082f, 57.38f, 82.61f),
                    PathNode.LineTo(39.93f, 72.54f),
                    PathNode.CurveTo(38.690044f, 71.75176f, 37.117752f, 71.706764f, 35.834747f, 72.422806f),
                    PathNode.CurveTo(34.551746f, 73.13885f, 33.76458f, 74.50065f, 33.784466f, 75.9698f),
                    PathNode.CurveTo(33.80435f, 77.43896f, 34.62809f, 78.778946f, 35.93f, 79.46f),
                    PathNode.LineTo(53.37f, 89.53f),
                    PathNode.CurveTo(47.827087f, 100.215775f, 44.664577f, 111.9754f, 44.1f, 124.0f),
                    PathNode.LineTo(24.0f, 124.0f),
                    PathNode.CurveTo(21.790861f, 124.0f, 20.0f, 125.79086f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 130.20914f, 21.790861f, 132.0f, 24.0f, 132.0f),
                    PathNode.LineTo(44.1f, 132.0f),
                    PathNode.CurveTo(44.664577f, 144.0246f, 47.827087f, 155.78423f, 53.37f, 166.47f),
                    PathNode.LineTo(35.93f, 176.54f),
                    PathNode.CurveTo(34.366432f, 177.44699f, 33.60544f, 179.28989f, 34.073517f, 181.03581f),
                    PathNode.CurveTo(34.541595f, 182.78174f, 36.122414f, 183.9968f, 37.93f, 184.0f),
                    PathNode.CurveTo(38.633156f, 184.00359f, 39.324203f, 183.817f, 39.93f, 183.46f),
                    PathNode.LineTo(57.38f, 173.39f),
                    PathNode.CurveTo(63.89927f, 183.49919f, 72.50082f, 192.10074f, 82.61f, 198.62f),
                    PathNode.LineTo(72.54f, 216.07f),
                    PathNode.CurveTo(71.43753f, 217.98119f, 72.090775f, 220.42415f, 74.0f, 221.53f),
                    PathNode.CurveTo(75.91119f, 222.63246f, 78.35414f, 221.97922f, 79.46f, 220.07f),
                    PathNode.LineTo(89.53f, 202.63f),
                    PathNode.CurveTo(100.215775f, 208.17291f, 111.9754f, 211.33542f, 124.0f, 211.9f),
                    PathNode.LineTo(124.0f, 232.0f),
                    PathNode.CurveTo(124.0f, 234.20914f, 125.79086f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(130.20914f, 236.0f, 132.0f, 234.20914f, 132.0f, 232.0f),
                    PathNode.LineTo(132.0f, 211.9f),
                    PathNode.CurveTo(144.0246f, 211.33542f, 155.78423f, 208.17291f, 166.47f, 202.63f),
                    PathNode.LineTo(176.54f, 220.07f),
                    PathNode.CurveTo(177.68999f, 221.87901f, 180.06158f, 222.45992f, 181.91743f, 221.38718f),
                    PathNode.CurveTo(183.7733f, 220.31442f, 184.45361f, 217.9694f, 183.46f, 216.07f),
                    PathNode.LineTo(173.39f, 198.62f),
                    PathNode.CurveTo(183.49919f, 192.10074f, 192.10074f, 183.49919f, 198.62f, 173.39f),
                    PathNode.LineTo(216.07f, 183.46f),
                    PathNode.CurveTo(216.6758f, 183.817f, 217.36684f, 184.00359f, 218.07f, 184.0f),
                    PathNode.CurveTo(219.87758f, 183.9968f, 221.4584f, 182.78174f, 221.92648f, 181.03581f),
                    PathNode.CurveTo(222.39456f, 179.28989f, 221.63358f, 177.44699f, 220.07f, 176.54f),
                    PathNode.LineTo(202.63f, 166.47f),
                    PathNode.CurveTo(208.17291f, 155.78423f, 211.33542f, 144.0246f, 211.9f, 132.0f),
                    PathNode.LineTo(232.0f, 132.0f),
                    PathNode.CurveTo(234.20914f, 132.0f, 236.0f, 130.20914f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 125.79086f, 234.20914f, 124.0f, 232.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 52.0f),
                    PathNode.CurveTo(168.39932f, 52.047787f, 201.71848f, 83.65906f, 203.89f, 124.0f),
                    PathNode.LineTo(130.31f, 124.0f),
                    PathNode.LineTo(93.53f, 60.3f),
                    PathNode.CurveTo(104.199486f, 54.83968f, 116.014465f, 51.994762f, 128.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 128.0f),
                    PathNode.CurveTo(52.017136f, 102.281494f, 65.04007f, 78.31643f, 86.61f, 64.31f),
                    PathNode.LineTo(123.38f, 128.0f),
                    PathNode.LineTo(86.61f, 191.69f),
                    PathNode.CurveTo(65.04007f, 177.68356f, 52.017136f, 153.7185f, 52.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 204.0f),
                    PathNode.CurveTo(116.014465f, 204.00523f, 104.199486f, 201.16032f, 93.53f, 195.7f),
                    PathNode.LineTo(130.31f, 132.0f),
                    PathNode.LineTo(203.89f, 132.0f),
                    PathNode.CurveTo(201.71848f, 172.34094f, 168.39932f, 203.95221f, 128.0f, 204.0f),
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
        return _gearFine!!
    }

private var _gearFine: ImageVector? = null
