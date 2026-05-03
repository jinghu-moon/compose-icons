package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorFillIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 104.0f),
                    PathNode.LineTo(24.0f, 104.0f),
                    PathNode.CurveTo(21.783163f, 104.00487f, 19.663696f, 103.08966f, 18.147192f, 101.47269f),
                    PathNode.CurveTo(16.630688f, 99.85571f, 15.853129f, 97.68197f, 16.0f, 95.47f),
                    PathNode.CurveTo(16.367125f, 91.194534f, 19.979347f, 87.93174f, 24.27f, 88.0f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.CurveTo(114.216835f, 88.00487f, 116.3363f, 87.08966f, 117.852806f, 85.47269f),
                    PathNode.CurveTo(119.36931f, 83.85571f, 120.14687f, 81.68197f, 120.0f, 79.47f),
                    PathNode.CurveTo(119.63287f, 75.194534f, 116.02065f, 71.93174f, 111.73f, 72.0f),
                    PathNode.LineTo(92.29f, 72.0f),
                    PathNode.CurveTo(91.120544f, 72.01237f, 90.00426f, 71.512314f, 89.23495f, 70.63145f),
                    PathNode.CurveTo(88.46563f, 69.75057f, 88.12035f, 68.57715f, 88.29f, 67.42f),
                    PathNode.CurveTo(90.73354f, 50.523083f, 106.01148f, 38.520176f, 123.006645f, 40.145336f),
                    PathNode.CurveTo(140.0018f, 41.770496f, 152.72812f, 56.451305f, 151.92513f, 73.505104f),
                    PathNode.CurveTo(151.12215f, 90.5589f, 137.07268f, 103.97895f, 120.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(239.92f, 101.71f),
                    PathNode.CurveTo(238.75381f, 85.40629f, 225.48796f, 72.60205f, 209.15318f, 72.01381f),
                    PathNode.CurveTo(192.8184f, 71.42556f, 178.6659f, 83.2424f, 176.33f, 99.42f),
                    PathNode.CurveTo(176.16035f, 100.57715f, 176.50563f, 101.75057f, 177.27495f, 102.63145f),
                    PathNode.CurveTo(178.04427f, 103.512314f, 179.16055f, 104.01237f, 180.33f, 104.0f),
                    PathNode.LineTo(199.77f, 104.0f),
                    PathNode.CurveTo(204.05301f, 103.94234f, 207.6534f, 107.20232f, 208.02f, 111.47f),
                    PathNode.CurveTo(208.16687f, 113.68197f, 207.38931f, 115.85571f, 205.8728f, 117.47269f),
                    PathNode.CurveTo(204.35631f, 119.08966f, 202.23683f, 120.00487f, 200.02f, 120.0f),
                    PathNode.LineTo(32.27f, 120.0f),
                    PathNode.CurveTo(27.979347f, 119.93174f, 24.367125f, 123.194534f, 24.0f, 127.47f),
                    PathNode.CurveTo(23.853128f, 129.68198f, 24.630688f, 131.85571f, 26.147192f, 133.47269f),
                    PathNode.CurveTo(27.663696f, 135.08966f, 29.783163f, 136.00487f, 32.0f, 136.0f),
                    PathNode.LineTo(208.0f, 136.0f),
                    PathNode.CurveTo(216.88512f, 136.00056f, 225.37047f, 132.30695f, 231.4244f, 125.8035f),
                    PathNode.CurveTo(237.47836f, 119.30006f, 240.55585f, 110.57233f, 239.92f, 101.71f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 152.0f),
                    PathNode.LineTo(40.27f, 152.0f),
                    PathNode.CurveTo(35.979347f, 151.93175f, 32.367123f, 155.19453f, 32.0f, 159.47f),
                    PathNode.CurveTo(31.853128f, 161.68199f, 32.630688f, 163.85571f, 34.14719f, 165.47269f),
                    PathNode.CurveTo(35.663696f, 167.08966f, 37.783165f, 168.00487f, 40.0f, 168.0f),
                    PathNode.LineTo(143.73f, 168.0f),
                    PathNode.CurveTo(148.013f, 167.94234f, 151.61339f, 171.20233f, 151.98f, 175.47f),
                    PathNode.CurveTo(152.12688f, 177.68199f, 151.34932f, 179.85571f, 149.83281f, 181.47269f),
                    PathNode.CurveTo(148.3163f, 183.08966f, 146.19684f, 184.00487f, 143.98f, 184.0f),
                    PathNode.LineTo(124.29f, 184.0f),
                    PathNode.CurveTo(123.120544f, 183.98763f, 122.00426f, 184.48769f, 121.23495f, 185.36856f),
                    PathNode.CurveTo(120.46563f, 186.24942f, 120.12035f, 187.42285f, 120.29f, 188.58f),
                    PathNode.CurveTo(122.73354f, 205.47691f, 138.01147f, 217.47983f, 155.00664f, 215.85466f),
                    PathNode.CurveTo(172.0018f, 214.2295f, 184.72812f, 199.54869f, 183.92513f, 182.4949f),
                    PathNode.CurveTo(183.12215f, 165.4411f, 169.07268f, 152.02106f, 152.0f, 152.0f),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
