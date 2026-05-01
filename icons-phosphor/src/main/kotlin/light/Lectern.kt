package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = phosphorLightIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.51f, 121.74f),
                    PathNode.LineTo(204.51f, 41.74f),
                    PathNode.CurveTo(202.1552f, 36.987305f, 197.30406f, 33.985886f, 192.0f, 34.0f),
                    PathNode.LineTo(64.0f, 34.0f),
                    PathNode.CurveTo(58.692337f, 33.982067f, 53.836403f, 36.984062f, 51.48f, 41.74f),
                    PathNode.LineTo(11.48f, 121.74f),
                    PathNode.CurveTo(9.310709f, 126.07944f, 9.542648f, 131.23264f, 12.093004f, 135.35965f),
                    PathNode.CurveTo(14.64336f, 139.48665f, 19.148552f, 141.99915f, 24.0f, 142.0f),
                    PathNode.LineTo(122.0f, 142.0f),
                    PathNode.LineTo(122.0f, 210.0f),
                    PathNode.LineTo(96.0f, 210.0f),
                    PathNode.CurveTo(92.686295f, 210.0f, 90.0f, 212.6863f, 90.0f, 216.0f),
                    PathNode.CurveTo(90.0f, 219.3137f, 92.686295f, 222.0f, 96.0f, 222.0f),
                    PathNode.LineTo(160.0f, 222.0f),
                    PathNode.CurveTo(163.3137f, 222.0f, 166.0f, 219.3137f, 166.0f, 216.0f),
                    PathNode.CurveTo(166.0f, 212.6863f, 163.3137f, 210.0f, 160.0f, 210.0f),
                    PathNode.LineTo(134.0f, 210.0f),
                    PathNode.LineTo(134.0f, 142.0f),
                    PathNode.LineTo(232.0f, 142.0f),
                    PathNode.CurveTo(236.85146f, 141.99915f, 241.35664f, 139.48665f, 243.907f, 135.35965f),
                    PathNode.CurveTo(246.45734f, 131.23264f, 246.68929f, 126.07944f, 244.52f, 121.74f),
                    PathNode.Close,
                    PathNode.MoveTo(233.69f, 129.05f),
                    PathNode.CurveTo(233.33635f, 129.6503f, 232.68658f, 130.0134f, 231.99f, 130.0f),
                    PathNode.LineTo(24.0f, 130.0f),
                    PathNode.CurveTo(23.307913f, 129.99963f, 22.665207f, 129.64148f, 22.300781f, 129.05312f),
                    PathNode.CurveTo(21.93636f, 128.46474f, 21.902021f, 127.72978f, 22.21f, 127.11f),
                    PathNode.LineTo(62.21f, 47.11f),
                    PathNode.CurveTo(62.54773f, 46.430344f, 63.241055f, 46.000404f, 64.0f, 46.0f),
                    PathNode.LineTo(192.0f, 46.0f),
                    PathNode.CurveTo(192.75894f, 46.000404f, 193.45227f, 46.430344f, 193.79f, 47.11f),
                    PathNode.LineTo(233.79f, 127.11f),
                    PathNode.CurveTo(234.09402f, 127.73052f, 234.05623f, 128.46404f, 233.69f, 129.05f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 104.0f),
                    PathNode.CurveTo(190.0f, 107.313705f, 187.3137f, 110.0f, 184.0f, 110.0f),
                    PathNode.LineTo(72.0f, 110.0f),
                    PathNode.CurveTo(68.686295f, 110.0f, 66.0f, 107.313705f, 66.0f, 104.0f),
                    PathNode.CurveTo(66.0f, 100.686295f, 68.686295f, 98.0f, 72.0f, 98.0f),
                    PathNode.LineTo(184.0f, 98.0f),
                    PathNode.CurveTo(187.3137f, 98.0f, 190.0f, 100.686295f, 190.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lectern!!
    }

private var _lectern: ImageVector? = null
