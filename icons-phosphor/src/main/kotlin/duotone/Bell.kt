package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = phosphorDuotoneIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 192.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.CurveTo(45.15049f, 191.98286f, 42.525204f, 190.4513f, 41.107876f, 187.97922f),
                    PathNode.CurveTo(39.69055f, 185.50714f, 39.695168f, 182.46776f, 41.12f, 180.0f),
                    PathNode.CurveTo(47.71f, 168.6f, 56.0f, 139.81f, 56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 64.2355f, 88.2355f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(167.7645f, 32.0f, 200.0f, 64.2355f, 200.0f, 104.0f),
                    PathNode.CurveTo(200.0f, 139.82f, 208.3f, 168.6f, 214.9f, 180.0f),
                    PathNode.CurveTo(216.32657f, 182.47084f, 216.32927f, 185.51445f, 214.90707f, 187.98782f),
                    PathNode.CurveTo(213.4849f, 190.4612f, 210.85309f, 191.98994f, 208.0f, 192.0f),
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
                    PathNode.MoveTo(221.8f, 175.94f),
                    PathNode.CurveTo(216.25f, 166.38f, 208.0f, 139.33f, 208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 59.81722f, 172.18279f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(83.81722f, 24.0f, 48.0f, 59.81722f, 48.0f, 104.0f),
                    PathNode.CurveTo(48.0f, 139.34f, 39.74f, 166.38f, 34.19f, 175.94f),
                    PathNode.CurveTo(31.305237f, 180.8869f, 31.284256f, 186.99834f, 34.134987f, 191.96494f),
                    PathNode.CurveTo(36.985718f, 196.9315f, 42.27343f, 199.99585f, 48.0f, 200.0f),
                    PathNode.LineTo(88.81f, 200.0f),
                    PathNode.CurveTo(92.61512f, 218.61942f, 108.995766f, 231.99101f, 128.0f, 231.99101f),
                    PathNode.CurveTo(147.00423f, 231.99101f, 163.38487f, 218.61942f, 167.19f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(213.72478f, 199.99228f, 219.00922f, 196.92653f, 221.85751f, 191.96059f),
                    PathNode.CurveTo(224.7058f, 186.99466f, 224.68387f, 180.88536f, 221.8f, 175.94f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(117.83194f, 215.99686f, 108.769356f, 209.58655f, 105.38f, 200.0f),
                    PathNode.LineTo(150.62f, 200.0f),
                    PathNode.CurveTo(147.23064f, 209.58655f, 138.16808f, 215.99686f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 184.0f),
                    PathNode.CurveTo(55.7f, 170.76f, 64.0f, 140.08f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 68.65378f, 92.65378f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(163.34622f, 40.0f, 192.0f, 68.65378f, 192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 140.05f, 200.28f, 170.73f, 208.0f, 184.0f),
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
        return _bell!!
    }

private var _bell: ImageVector? = null
