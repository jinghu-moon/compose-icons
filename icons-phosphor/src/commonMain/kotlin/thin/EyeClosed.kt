package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorThinIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.0f, 171.47f),
                    PathNode.CurveTo(225.39282f, 171.82259f, 224.7021f, 172.00563f, 224.0f, 172.0f),
                    PathNode.CurveTo(222.56883f, 172.0021f, 221.24559f, 171.23943f, 220.53f, 170.0f),
                    PathNode.LineTo(199.38f, 133.0f),
                    PathNode.CurveTo(186.80812f, 142.16528f, 172.57396f, 148.79839f, 157.47f, 152.53f),
                    PathNode.LineTo(164.0f, 191.34f),
                    PathNode.CurveTo(164.36118f, 193.51863f, 162.88844f, 195.57774f, 160.71f, 195.94f),
                    PathNode.CurveTo(160.48889f, 195.97981f, 160.26465f, 195.9999f, 160.04f, 196.0f),
                    PathNode.CurveTo(158.08752f, 195.99747f, 156.42216f, 194.58572f, 156.1f, 192.66f),
                    PathNode.LineTo(149.69f, 154.16f),
                    PathNode.CurveTo(135.36765f, 156.61339f, 120.73236f, 156.61339f, 106.41f, 154.16f),
                    PathNode.LineTo(100.0f, 192.66f),
                    PathNode.CurveTo(99.674255f, 194.60826f, 97.97513f, 196.02704f, 96.0f, 196.0f),
                    PathNode.CurveTo(95.77535f, 195.99944f, 95.55118f, 195.97935f, 95.33f, 195.94f),
                    PathNode.CurveTo(93.15155f, 195.57774f, 91.67883f, 193.51863f, 92.04f, 191.34f),
                    PathNode.LineTo(98.52f, 152.51f),
                    PathNode.CurveTo(83.421036f, 148.78325f, 69.19045f, 142.15703f, 56.62f, 133.0f),
                    PathNode.LineTo(35.47f, 170.0f),
                    PathNode.CurveTo(34.754417f, 171.23943f, 33.431168f, 172.0021f, 32.0f, 172.0f),
                    PathNode.CurveTo(31.2979f, 172.00563f, 30.607172f, 171.82259f, 30.0f, 171.47f),
                    PathNode.CurveTo(29.07866f, 170.94054f, 28.405865f, 170.06622f, 28.130077f, 169.04f),
                    PathNode.CurveTo(27.854292f, 168.01376f, 27.998182f, 166.91998f, 28.53f, 166.0f),
                    PathNode.LineTo(50.21f, 128.06f),
                    PathNode.CurveTo(42.385098f, 121.62094f, 35.24107f, 114.3965f, 28.89f, 106.5f),
                    PathNode.CurveTo(27.873775f, 105.402405f, 27.554861f, 103.82953f, 28.063314f, 102.42279f),
                    PathNode.CurveTo(28.571766f, 101.01605f, 29.82261f, 100.01055f, 31.305752f, 99.81633f),
                    PathNode.CurveTo(32.788895f, 99.62211f, 34.25647f, 100.27162f, 35.11f, 101.5f),
                    PathNode.CurveTo(52.25f, 122.71f, 82.29f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(173.71f, 148.0f, 203.75f, 122.71f, 220.89f, 101.49f),
                    PathNode.CurveTo(221.74353f, 100.26162f, 223.2111f, 99.61211f, 224.69424f, 99.80633f),
                    PathNode.CurveTo(226.17738f, 100.00055f, 227.42824f, 101.00605f, 227.93669f, 102.41279f),
                    PathNode.CurveTo(228.44514f, 103.81953f, 228.12622f, 105.3924f, 227.11f, 106.49f),
                    PathNode.CurveTo(220.75893f, 114.38649f, 213.6149f, 121.61094f, 205.79f, 128.05f),
                    PathNode.LineTo(227.47f, 166.0f),
                    PathNode.CurveTo(228.0018f, 166.91998f, 228.1457f, 168.01376f, 227.86992f, 169.04f),
                    PathNode.CurveTo(227.59413f, 170.06622f, 226.92134f, 170.94054f, 226.0f, 171.47f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
