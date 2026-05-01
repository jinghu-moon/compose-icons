package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorFillIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 137.24f, 218.15f, 157.72f, 209.7f, 174.14f),
                    PathNode.CurveTo(209.10312f, 175.31256f, 207.96776f, 176.1166f, 206.66353f, 176.29036f),
                    PathNode.CurveTo(205.35933f, 176.46413f, 204.05305f, 175.98538f, 203.17f, 175.01f),
                    PathNode.LineTo(86.52f, 46.69f),
                    PathNode.CurveTo(85.4504f, 45.513046f, 85.17965f, 43.81425f, 85.83038f, 42.36311f),
                    PathNode.CurveTo(86.48112f, 40.91197f, 87.92971f, 39.98418f, 89.52f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(216.83656f, 40.0f, 224.0f, 47.163445f, 224.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(51.444565f, 31.905285f, 47.438316f, 31.22556f, 44.205997f, 32.971863f),
                    PathNode.CurveTo(40.973682f, 34.718166f, 39.34627f, 38.44155f, 40.26f, 42.0f),
                    PathNode.CurveTo(35.164642f, 44.81634f, 32.0012f, 50.17811f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 164.72f, 57.52f, 196.67f, 78.93f, 214.19f),
                    PathNode.CurveTo(101.99f, 233.05f, 124.93f, 239.46f, 125.93f, 239.72f),
                    PathNode.CurveTo(127.305016f, 240.09406f, 128.75499f, 240.09406f, 130.13f, 239.72f),
                    PathNode.CurveTo(131.13f, 239.46f, 154.04f, 233.05f, 177.13f, 214.19f),
                    PathNode.CurveTo(180.63599f, 211.30174f, 183.99046f, 208.23431f, 187.18f, 205.0f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
