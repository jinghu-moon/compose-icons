package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BellZ: ImageVector
    get() {
        if (_bellZ != null) return _bellZ!!
        _bellZ = phosphorRegularIcon(
            name = "BellZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 144.0f),
                    PathNode.CurveTo(152.0f, 148.41827f, 148.41827f, 152.0f, 144.0f, 152.0f),
                    PathNode.LineTo(112.0f, 152.0f),
                    PathNode.CurveTo(109.04999f, 151.99823f, 106.34034f, 150.37311f, 104.94959f, 147.77147f),
                    PathNode.CurveTo(103.55885f, 145.16985f, 103.71274f, 142.01398f, 105.35f, 139.56f),
                    PathNode.LineTo(129.05f, 104.0f),
                    PathNode.LineTo(112.0f, 104.0f),
                    PathNode.CurveTo(107.58172f, 104.0f, 104.0f, 100.41828f, 104.0f, 96.0f),
                    PathNode.CurveTo(104.0f, 91.58172f, 107.58172f, 88.0f, 112.0f, 88.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(146.95001f, 88.00177f, 149.65967f, 89.6269f, 151.05042f, 92.22852f),
                    PathNode.CurveTo(152.44115f, 94.83015f, 152.28726f, 97.98602f, 150.65f, 100.44f),
                    PathNode.LineTo(127.0f, 136.0f),
                    PathNode.LineTo(144.0f, 136.0f),
                    PathNode.CurveTo(148.41827f, 136.0f, 152.0f, 139.58173f, 152.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.84f, 192.0f),
                    PathNode.CurveTo(219.01549f, 196.9759f, 213.72156f, 200.03598f, 208.0f, 200.0f),
                    PathNode.LineTo(167.19f, 200.0f),
                    PathNode.CurveTo(163.38487f, 218.61942f, 147.00423f, 231.99101f, 128.0f, 231.99101f),
                    PathNode.CurveTo(108.995766f, 231.99101f, 92.61512f, 218.61942f, 88.81f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(42.275215f, 199.99228f, 36.99078f, 196.92653f, 34.14249f, 191.96059f),
                    PathNode.CurveTo(31.2942f, 186.99466f, 31.316132f, 180.88536f, 34.2f, 175.94f),
                    PathNode.CurveTo(39.75f, 166.38f, 48.0f, 139.34f, 48.0f, 104.0f),
                    PathNode.CurveTo(48.0f, 59.81722f, 83.81722f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(172.18279f, 24.0f, 208.0f, 59.81722f, 208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 139.33f, 216.26f, 166.38f, 221.81f, 175.94f),
                    PathNode.CurveTo(224.72365f, 180.89397f, 224.73512f, 187.03517f, 221.84f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.62f, 200.0f),
                    PathNode.LineTo(105.38f, 200.0f),
                    PathNode.CurveTo(108.77641f, 209.5783f, 117.837364f, 215.97905f, 128.0f, 215.97905f),
                    PathNode.CurveTo(138.16264f, 215.97905f, 147.22359f, 209.5783f, 150.62f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 184.0f),
                    PathNode.CurveTo(200.27f, 170.73f, 192.0f, 140.05f, 192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 68.65378f, 163.34622f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(92.65378f, 40.0f, 64.0f, 68.65378f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 140.06f, 55.72f, 170.74f, 48.0f, 184.0f),
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
        return _bellZ!!
    }

private var _bellZ: ImageVector? = null
