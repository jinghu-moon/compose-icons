package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandTap: ImageVector
    get() {
        if (_handTap != null) return _handTap!!
        _handTap = phosphorFillIcon(
            name = "HandTap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(64.0f, 64.0f),
                    PathNode.CurveTo(64.0f, 37.490334f, 85.49033f, 16.0f, 112.0f, 16.0f),
                    PathNode.CurveTo(138.50967f, 16.0f, 160.0f, 37.490334f, 160.0f, 64.0f),
                    PathNode.CurveTo(160.0f, 68.41828f, 156.41827f, 72.0f, 152.0f, 72.0f),
                    PathNode.CurveTo(147.58173f, 72.0f, 144.0f, 68.41828f, 144.0f, 64.0f),
                    PathNode.CurveTo(144.0f, 46.32689f, 129.67311f, 32.0f, 112.0f, 32.0f),
                    PathNode.CurveTo(94.32689f, 32.0f, 80.0f, 46.32689f, 80.0f, 64.0f),
                    PathNode.CurveTo(80.0f, 68.41828f, 76.41828f, 72.0f, 72.0f, 72.0f),
                    PathNode.CurveTo(67.58172f, 72.0f, 64.0f, 68.41828f, 64.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(207.23f, 120.0f),
                    PathNode.CurveTo(198.62f, 120.4f, 192.0f, 127.82f, 192.0f, 136.43f),
                    PathNode.LineTo(192.0f, 143.71f),
                    PathNode.CurveTo(192.05766f, 147.993f, 188.79767f, 151.59337f, 184.53f, 151.96f),
                    PathNode.CurveTo(182.31801f, 152.10687f, 180.14429f, 151.32932f, 178.52731f, 149.8128f),
                    PathNode.CurveTo(176.91034f, 148.29631f, 175.99513f, 146.17683f, 176.0f, 143.96f),
                    PathNode.LineTo(176.0f, 120.45f),
                    PathNode.CurveTo(176.0f, 111.84f, 169.38f, 104.45f, 160.77f, 104.02f),
                    PathNode.CurveTo(156.39824f, 103.809364f, 152.13104f, 105.39886f, 148.96242f, 108.41821f),
                    PathNode.CurveTo(145.7938f, 111.43757f, 144.0004f, 115.62317f, 144.0f, 120.0f),
                    PathNode.LineTo(144.0f, 135.73f),
                    PathNode.CurveTo(144.05766f, 140.013f, 140.79767f, 143.61339f, 136.53f, 143.98f),
                    PathNode.CurveTo(134.31801f, 144.12688f, 132.14429f, 143.34932f, 130.52731f, 141.83281f),
                    PathNode.CurveTo(128.91034f, 140.3163f, 127.99513f, 138.19684f, 128.0f, 135.98f),
                    PathNode.LineTo(128.0f, 64.45f),
                    PathNode.CurveTo(128.0f, 55.84f, 121.38f, 48.45f, 112.77f, 48.02f),
                    PathNode.CurveTo(108.39824f, 47.809364f, 104.131035f, 49.398857f, 100.96241f, 52.418213f),
                    PathNode.CurveTo(97.79379f, 55.43757f, 96.0004f, 59.623165f, 96.0f, 64.0f),
                    PathNode.LineTo(96.0f, 183.74f),
                    PathNode.CurveTo(96.05019f, 187.735f, 93.21049f, 191.18321f, 89.28f, 191.9f),
                    PathNode.LineTo(89.16f, 191.9f),
                    PathNode.CurveTo(86.71996f, 192.1737f, 84.354225f, 190.95535f, 83.16f, 188.81f),
                    PathNode.LineTo(62.16f, 152.37f),
                    PathNode.CurveTo(57.86f, 144.91f, 48.42f, 141.8f, 40.76f, 145.75f),
                    PathNode.CurveTo(36.848244f, 147.73943f, 33.925358f, 151.24828f, 32.67559f, 155.45514f),
                    PathNode.CurveTo(31.42582f, 159.662f, 31.958887f, 164.19754f, 34.15f, 168.0f),
                    PathNode.LineTo(65.1f, 228.05f),
                    PathNode.CurveTo(66.53663f, 230.49727f, 69.16221f, 232.00032f, 72.0f, 232.0f),
                    PathNode.LineTo(208.0f, 232.0f),
                    PathNode.CurveTo(211.03131f, 232.00217f, 213.80348f, 230.29086f, 215.16f, 227.58f),
                    PathNode.CurveTo(215.52f, 226.86f, 224.0f, 212.52f, 224.0f, 186.93f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.CurveTo(224.00508f, 131.61969f, 222.21408f, 127.42884f, 219.04483f, 124.405106f),
                    PathNode.CurveTo(215.87558f, 121.38138f, 211.60522f, 119.78919f, 207.23f, 120.0f),
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
        return _handTap!!
    }

private var _handTap: ImageVector? = null
