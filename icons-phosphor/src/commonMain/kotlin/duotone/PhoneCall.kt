package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) return _phoneCall!!
        _phoneCall = phosphorDuotoneIcon(
            name = "PhoneCall",
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
                    PathNode.MoveTo(144.27f, 45.93f),
                    PathNode.CurveTo(144.81844f, 43.879528f, 146.15924f, 42.131058f, 147.99728f, 41.069508f),
                    PathNode.CurveTo(149.83531f, 40.007954f, 152.01985f, 39.72035f, 154.07f, 40.27f),
                    PathNode.CurveTo(184.26808f, 48.149033f, 207.85097f, 71.73192f, 215.73f, 101.93f),
                    PathNode.CurveTo(216.27965f, 103.98015f, 215.99205f, 106.16469f, 214.9305f, 108.00272f),
                    PathNode.CurveTo(213.86894f, 109.84074f, 212.12047f, 111.18156f, 210.07f, 111.73f),
                    PathNode.CurveTo(209.39426f, 111.9075f, 208.69867f, 111.99823f, 208.0f, 112.0f),
                    PathNode.CurveTo(204.37518f, 111.9999f, 201.20338f, 109.562584f, 200.27f, 106.06f),
                    PathNode.CurveTo(193.84392f, 81.407845f, 174.59216f, 62.15609f, 149.94f, 55.73f),
                    PathNode.CurveTo(147.88768f, 55.18372f, 146.13681f, 53.843792f, 145.07324f, 52.00552f),
                    PathNode.CurveTo(144.00966f, 50.167248f, 143.72069f, 47.98151f, 144.27f, 45.93f),
                    PathNode.Close,
                    PathNode.MoveTo(141.94f, 87.73f),
                    PathNode.CurveTo(155.73f, 91.41f, 164.59f, 100.27f, 168.27f, 114.06f),
                    PathNode.CurveTo(169.20338f, 117.562584f, 172.37518f, 119.9999f, 176.0f, 120.0f),
                    PathNode.CurveTo(176.69867f, 119.99823f, 177.39426f, 119.9075f, 178.07f, 119.73f),
                    PathNode.CurveTo(180.12047f, 119.18156f, 181.86894f, 117.84074f, 182.9305f, 116.00272f),
                    PathNode.CurveTo(183.99205f, 114.16469f, 184.27965f, 111.98015f, 183.73f, 109.93f),
                    PathNode.CurveTo(178.61f, 90.77f, 165.23f, 77.39f, 146.07f, 72.27f),
                    PathNode.CurveTo(141.80084f, 71.129524f, 137.41547f, 73.66584f, 136.275f, 77.935f),
                    PathNode.CurveTo(135.13454f, 82.20416f, 137.67084f, 86.58953f, 141.94f, 87.73f),
                    PathNode.Close,
                    PathNode.MoveTo(223.88f, 183.08f),
                    PathNode.CurveTo(220.19142f, 211.1111f, 196.2727f, 232.05067f, 168.0f, 232.0f),
                    PathNode.CurveTo(88.6f, 232.0f, 24.0f, 167.4f, 24.0f, 88.0f),
                    PathNode.CurveTo(23.949318f, 59.7273f, 44.8889f, 35.80858f, 72.92f, 32.12f),
                    PathNode.CurveTo(79.95731f, 31.26072f, 86.720985f, 35.134975f, 89.54f, 41.64f),
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
                    PathNode.CurveTo(136.30379f, 180.9401f, 136.05675f, 181.12704f, 135.8f, 181.3f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
