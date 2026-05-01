package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = phosphorLightIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.0f, 42.34f),
                    PathNode.LineTo(166.0f, 32.0f),
                    PathNode.CurveTo(166.0f, 19.849735f, 156.15027f, 10.0f, 144.0f, 10.0f),
                    PathNode.LineTo(112.0f, 10.0f),
                    PathNode.CurveTo(99.84974f, 10.0f, 90.0f, 19.849735f, 90.0f, 32.0f),
                    PathNode.LineTo(90.0f, 42.34f),
                    PathNode.CurveTo(62.686493f, 45.42575f, 42.034676f, 68.51276f, 42.0f, 96.0f),
                    PathNode.LineTo(42.0f, 216.0f),
                    PathNode.CurveTo(42.0f, 223.73198f, 48.268013f, 230.0f, 56.0f, 230.0f),
                    PathNode.LineTo(200.0f, 230.0f),
                    PathNode.CurveTo(207.73198f, 230.0f, 214.0f, 223.73198f, 214.0f, 216.0f),
                    PathNode.LineTo(214.0f, 96.0f),
                    PathNode.CurveTo(213.96533f, 68.51276f, 193.3135f, 45.42575f, 166.0f, 42.34f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 22.0f),
                    PathNode.LineTo(144.0f, 22.0f),
                    PathNode.CurveTo(149.52284f, 22.0f, 154.0f, 26.477152f, 154.0f, 32.0f),
                    PathNode.LineTo(154.0f, 42.0f),
                    PathNode.LineTo(102.0f, 42.0f),
                    PathNode.LineTo(102.0f, 32.0f),
                    PathNode.CurveTo(102.0f, 26.477152f, 106.47715f, 22.0f, 112.0f, 22.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.0f, 162.0f),
                    PathNode.LineTo(86.0f, 162.0f),
                    PathNode.LineTo(86.0f, 152.0f),
                    PathNode.CurveTo(86.0f, 146.47716f, 90.47715f, 142.0f, 96.0f, 142.0f),
                    PathNode.LineTo(160.0f, 142.0f),
                    PathNode.CurveTo(165.52284f, 142.0f, 170.0f, 146.47716f, 170.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 174.0f),
                    PathNode.LineTo(138.0f, 174.0f),
                    PathNode.LineTo(138.0f, 184.0f),
                    PathNode.CurveTo(138.0f, 187.3137f, 140.6863f, 190.0f, 144.0f, 190.0f),
                    PathNode.CurveTo(147.3137f, 190.0f, 150.0f, 187.3137f, 150.0f, 184.0f),
                    PathNode.LineTo(150.0f, 174.0f),
                    PathNode.LineTo(170.0f, 174.0f),
                    PathNode.LineTo(170.0f, 218.0f),
                    PathNode.LineTo(86.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 216.0f),
                    PathNode.CurveTo(202.0f, 217.10457f, 201.10457f, 218.0f, 200.0f, 218.0f),
                    PathNode.LineTo(182.0f, 218.0f),
                    PathNode.LineTo(182.0f, 152.0f),
                    PathNode.CurveTo(182.0f, 139.84973f, 172.15027f, 130.0f, 160.0f, 130.0f),
                    PathNode.LineTo(96.0f, 130.0f),
                    PathNode.CurveTo(83.84974f, 130.0f, 74.0f, 139.84973f, 74.0f, 152.0f),
                    PathNode.LineTo(74.0f, 218.0f),
                    PathNode.LineTo(56.0f, 218.0f),
                    PathNode.CurveTo(54.89543f, 218.0f, 54.0f, 217.10457f, 54.0f, 216.0f),
                    PathNode.LineTo(54.0f, 96.0f),
                    PathNode.CurveTo(54.0f, 72.80404f, 72.80404f, 54.0f, 96.0f, 54.0f),
                    PathNode.LineTo(160.0f, 54.0f),
                    PathNode.CurveTo(183.19595f, 54.0f, 202.0f, 72.80404f, 202.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 88.0f),
                    PathNode.CurveTo(150.0f, 91.313705f, 147.3137f, 94.0f, 144.0f, 94.0f),
                    PathNode.LineTo(112.0f, 94.0f),
                    PathNode.CurveTo(108.686295f, 94.0f, 106.0f, 91.313705f, 106.0f, 88.0f),
                    PathNode.CurveTo(106.0f, 84.686295f, 108.686295f, 82.0f, 112.0f, 82.0f),
                    PathNode.LineTo(144.0f, 82.0f),
                    PathNode.CurveTo(147.3137f, 82.0f, 150.0f, 84.686295f, 150.0f, 88.0f),
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
        return _backpack!!
    }

private var _backpack: ImageVector? = null
