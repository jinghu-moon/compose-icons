package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) return _eyeSlash!!
        _eyeSlash = phosphorFillIcon(
            name = "EyeSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.68f, 57.87f),
                    PathNode.CurveTo(95.71853f, 56.8167f, 95.39058f, 55.33116f, 95.819244f, 53.97097f),
                    PathNode.CurveTo(96.24791f, 52.610786f, 97.36835f, 51.581707f, 98.76f, 51.27f),
                    PathNode.CurveTo(108.35171f, 49.078102f, 118.16106f, 47.981094f, 128.0f, 48.0f),
                    PathNode.CurveTo(162.88f, 48.0f, 194.57f, 61.26f, 219.66f, 86.35f),
                    PathNode.CurveTo(238.49f, 105.18f, 246.96f, 123.97f, 247.31f, 124.76f),
                    PathNode.CurveTo(248.22987f, 126.82903f, 248.22987f, 129.19096f, 247.31f, 131.26f),
                    PathNode.CurveTo(246.96f, 132.05f, 238.49f, 150.83f, 219.66f, 169.66f),
                    PathNode.QuadTo(215.38f, 173.92f, 210.87f, 177.73f),
                    PathNode.CurveTo(209.22559f, 179.12617f, 206.77028f, 178.96689f, 205.32f, 177.37f),
                    PathNode.Close,
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.CurveTo(215.88303f, 212.7287f, 216.56061f, 215.73003f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(214.82729f, 221.2251f, 212.55025f, 223.29443f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(206.91493f, 224.49586f, 203.9919f, 223.53516f, 202.08f, 221.38f),
                    PathNode.LineTo(180.0f, 197.13f),
                    PathNode.CurveTo(163.62483f, 204.37256f, 145.90517f, 208.07666f, 128.0f, 208.0f),
                    PathNode.CurveTo(93.12f, 208.0f, 61.43f, 194.74f, 36.34f, 169.66f),
                    PathNode.CurveTo(17.51f, 150.83f, 9.0f, 132.05f, 8.69f, 131.26f),
                    PathNode.CurveTo(7.770128f, 129.19096f, 7.770128f, 126.82903f, 8.69f, 124.76f),
                    PathNode.CurveTo(9.0f, 124.0f, 17.51f, 105.18f, 36.34f, 86.35f),
                    PathNode.CurveTo(43.862885f, 78.79244f, 52.25471f, 72.15283f, 61.34f, 66.57f),
                    PathNode.LineTo(42.08f, 45.38f),
                    PathNode.CurveTo(40.116978f, 43.271305f, 39.439384f, 40.26998f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(41.17271f, 34.774906f, 43.44975f, 32.70557f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(49.085068f, 31.50414f, 52.008102f, 32.46484f, 53.92f, 34.62f),
                    PathNode.Close,
                    PathNode.MoveTo(148.43f, 162.37f),
                    PathNode.LineTo(95.74f, 104.37f),
                    PathNode.CurveTo(84.5476f, 119.7052f, 85.67683f, 140.79538f, 98.44271f, 154.8478f),
                    PathNode.CurveTo(111.2086f, 168.9002f, 132.09384f, 172.04306f, 148.43f, 162.37f),
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
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
