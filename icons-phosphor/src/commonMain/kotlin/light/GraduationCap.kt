package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorLightIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(250.82f, 90.71f),
                    PathNode.LineTo(130.82f, 26.71f),
                    PathNode.CurveTo(129.05988f, 25.760567f, 126.94014f, 25.760567f, 125.18f, 26.71f),
                    PathNode.LineTo(5.18f, 90.71f),
                    PathNode.CurveTo(3.229105f, 91.75413f, 2.011236f, 93.78726f, 2.011236f, 96.0f),
                    PathNode.CurveTo(2.011236f, 98.21274f, 3.229105f, 100.24587f, 5.18f, 101.29f),
                    PathNode.LineTo(34.0f, 116.67f),
                    PathNode.LineTo(34.0f, 166.29f),
                    PathNode.CurveTo(33.999146f, 169.7271f, 35.26272f, 173.04443f, 37.55f, 175.61f),
                    PathNode.CurveTo(50.42f, 189.94f, 79.29f, 214.0f, 128.0f, 214.0f),
                    PathNode.CurveTo(145.1522f, 214.16083f, 162.15979f, 210.85115f, 178.0f, 204.27f),
                    PathNode.LineTo(178.0f, 240.0f),
                    PathNode.CurveTo(178.0f, 243.3137f, 180.6863f, 246.0f, 184.0f, 246.0f),
                    PathNode.CurveTo(187.3137f, 246.0f, 190.0f, 243.3137f, 190.0f, 240.0f),
                    PathNode.LineTo(190.0f, 198.35f),
                    PathNode.CurveTo(200.64949f, 192.35255f, 210.25725f, 184.66972f, 218.45f, 175.6f),
                    PathNode.CurveTo(220.74234f, 173.04149f, 222.00687f, 169.72522f, 222.0f, 166.29f),
                    PathNode.LineTo(222.0f, 116.67f),
                    PathNode.LineTo(250.82f, 101.29f),
                    PathNode.CurveTo(252.77089f, 100.24587f, 253.98877f, 98.21274f, 253.98877f, 96.0f),
                    PathNode.CurveTo(253.98877f, 93.78726f, 252.77089f, 91.75413f, 250.82f, 90.71f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 202.0f),
                    PathNode.CurveTo(84.0f, 202.0f, 58.0f, 180.44f, 46.48f, 167.59f),
                    PathNode.CurveTo(46.17019f, 167.22772f, 45.99996f, 166.7667f, 46.0f, 166.29f),
                    PathNode.LineTo(46.0f, 123.07f),
                    PathNode.LineTo(125.18f, 165.29f),
                    PathNode.CurveTo(126.94283f, 166.22867f, 129.05717f, 166.22867f, 130.82f, 165.29f),
                    PathNode.LineTo(178.0f, 140.13f),
                    PathNode.LineTo(178.0f, 191.13f),
                    PathNode.CurveTo(165.0f, 197.35f, 148.45f, 202.0f, 128.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 166.29f),
                    PathNode.CurveTo(210.00003f, 166.7667f, 209.82982f, 167.22772f, 209.52f, 167.59f),
                    PathNode.CurveTo(203.75706f, 173.97426f, 197.19652f, 179.5904f, 190.0f, 184.3f),
                    PathNode.LineTo(190.0f, 133.73f),
                    PathNode.LineTo(210.0f, 123.07f),
                    PathNode.Close,
                    PathNode.MoveTo(187.85f, 121.29f),
                    PathNode.CurveTo(187.54066f, 121.021225f, 187.20573f, 120.78342f, 186.85f, 120.58f),
                    PathNode.LineTo(130.85f, 90.72f),
                    PathNode.CurveTo(127.9513f, 89.327805f, 124.470406f, 90.468376f, 122.957695f, 93.30605f),
                    PathNode.CurveTo(121.444984f, 96.14372f, 122.43836f, 99.66945f, 125.21f, 101.3f),
                    PathNode.LineTo(175.25f, 128.0f),
                    PathNode.LineTo(128.0f, 153.2f),
                    PathNode.LineTo(20.75f, 96.0f),
                    PathNode.LineTo(128.0f, 38.8f),
                    PathNode.LineTo(235.25f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
