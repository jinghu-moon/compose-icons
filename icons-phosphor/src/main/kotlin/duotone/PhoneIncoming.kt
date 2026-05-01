package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PhoneIncoming: ImageVector
    get() {
        if (_phoneIncoming != null) return _phoneIncoming!!
        _phoneIncoming = phosphorDuotoneIcon(
            name = "PhoneIncoming",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.94f, 182.08f),
                    PathNode.CurveTo(212.72658f, 206.0945f, 192.22853f, 224.01852f, 168.0f, 224.0f),
                    PathNode.CurveTo(92.889275f, 224.0f, 32.0f, 163.11073f, 32.0f, 88.0f),
                    PathNode.CurveTo(31.98147f, 63.77146f, 49.9055f, 43.273422f, 73.92f, 40.06f),
                    PathNode.CurveTo(77.44522f, 39.64121f, 80.82478f, 41.595657f, 82.22f, 44.86f),
                    PathNode.LineTo(103.35f, 92.06f),
                    PathNode.CurveTo(104.40444f, 94.52222f, 104.15671f, 97.348755f, 102.69f, 99.59f),
                    PathNode.LineTo(81.32f, 125.0f),
                    PathNode.CurveTo(79.77795f, 127.326836f, 79.57286f, 130.29308f, 80.78f, 132.81f),
                    PathNode.CurveTo(89.05f, 149.74f, 106.55f, 167.03f, 123.53f, 175.22f),
                    PathNode.CurveTo(126.060646f, 176.42207f, 129.03807f, 176.19772f, 131.36f, 174.63f),
                    PathNode.LineTo(156.36f, 153.33f),
                    PathNode.CurveTo(158.61087f, 151.83223f, 161.46594f, 151.57268f, 163.95f, 152.64f),
                    PathNode.LineTo(211.11f, 173.77f),
                    PathNode.CurveTo(214.39005f, 175.15631f, 216.35892f, 178.54375f, 215.94f, 182.08f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 104.0f),
                    PathNode.LineTo(144.0f, 64.0f),
                    PathNode.CurveTo(144.0f, 59.581722f, 147.58173f, 56.0f, 152.0f, 56.0f),
                    PathNode.CurveTo(156.41827f, 56.0f, 160.0f, 59.581722f, 160.0f, 64.0f),
                    PathNode.LineTo(160.0f, 84.69f),
                    PathNode.LineTo(194.34f, 50.34f),
                    PathNode.CurveTo(197.46593f, 47.21407f, 202.53407f, 47.21407f, 205.66f, 50.34f),
                    PathNode.CurveTo(208.78593f, 53.46593f, 208.78593f, 58.53407f, 205.66f, 61.66f),
                    PathNode.LineTo(171.32f, 96.0f),
                    PathNode.LineTo(192.0f, 96.0f),
                    PathNode.CurveTo(196.41827f, 96.0f, 200.0f, 99.58172f, 200.0f, 104.0f),
                    PathNode.CurveTo(200.0f, 108.41828f, 196.41827f, 112.0f, 192.0f, 112.0f),
                    PathNode.LineTo(152.0f, 112.0f),
                    PathNode.CurveTo(147.58173f, 112.0f, 144.0f, 108.41828f, 144.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(223.88f, 183.08f),
                    PathNode.CurveTo(220.19142f, 211.1111f, 196.2727f, 232.05067f, 168.0f, 232.0f),
                    PathNode.CurveTo(88.6f, 232.0f, 24.0f, 167.4f, 24.0f, 88.0f),
                    PathNode.CurveTo(23.945507f, 59.727787f, 44.88823f, 35.809765f, 72.92f, 32.13f),
                    PathNode.CurveTo(79.95482f, 31.269175f, 86.71769f, 35.138905f, 89.54f, 41.64f),
                    PathNode.LineTo(110.66f, 88.79f),
                    PathNode.LineTo(110.66f, 88.91f),
                    PathNode.CurveTo(112.79448f, 93.834625f, 112.31756f, 99.5014f, 109.39f, 104.0f),
                    PathNode.CurveTo(109.21f, 104.27f, 109.02f, 104.52f, 108.82f, 104.77f),
                    PathNode.LineTo(88.0f, 129.45f),
                    PathNode.CurveTo(95.49f, 144.67f, 111.41f, 160.45f, 126.83f, 167.96f),
                    PathNode.LineTo(151.17f, 147.25f),
                    PathNode.CurveTo(151.40903f, 147.04907f, 151.65944f, 146.86209f, 151.92f, 146.69f),
                    PathNode.CurveTo(156.41577f, 143.69144f, 162.12137f, 143.16489f, 167.09f, 145.29f),
                    PathNode.LineTo(167.22f, 145.35f),
                    PathNode.LineTo(214.33f, 166.46f),
                    PathNode.CurveTo(220.84682f, 169.26912f, 224.73465f, 176.03517f, 223.88f, 183.08f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 181.08f),
                    PathNode.CurveTo(208.0f, 181.08f, 207.93f, 181.08f, 207.89f, 181.08f),
                    PathNode.LineTo(207.89f, 181.08f),
                    PathNode.LineTo(160.89f, 160.03f),
                    PathNode.LineTo(136.54f, 180.74f),
                    PathNode.CurveTo(136.30629f, 180.9432f, 136.05907f, 181.1303f, 135.8f, 181.3f),
                    PathNode.CurveTo(131.11627f, 184.42473f, 125.13489f, 184.85768f, 120.05f, 182.44f),
                    PathNode.CurveTo(101.32f, 173.39f, 82.65f, 154.86f, 73.59f, 136.33f),
                    PathNode.CurveTo(71.14984f, 131.28287f, 71.52921f, 125.32675f, 74.59f, 120.63f),
                    PathNode.CurveTo(74.75962f, 120.35886f, 74.9502f, 120.1014f, 75.16f, 119.86f),
                    PathNode.LineTo(96.0f, 95.15f),
                    PathNode.LineTo(75.0f, 48.15f),
                    PathNode.CurveTo(74.996056f, 48.110096f, 74.996056f, 48.069904f, 75.0f, 48.03f),
                    PathNode.CurveTo(54.937195f, 50.647102f, 39.945786f, 67.767296f, 40.0f, 88.0f),
                    PathNode.CurveTo(40.07716f, 158.66046f, 97.33954f, 215.92284f, 168.0f, 216.0f),
                    PathNode.CurveTo(188.21907f, 216.06946f, 205.34512f, 201.11412f, 208.0f, 181.07f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _phoneIncoming!!
    }

private var _phoneIncoming: ImageVector? = null
