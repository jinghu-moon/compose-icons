package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SimCard: ImageVector
    get() {
        if (_simCard != null) return _simCard!!
        _simCard = phosphorLightIcon(
            name = "SimCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.24f, 83.76f),
                    PathNode.LineTo(156.24f, 27.76f),
                    PathNode.CurveTo(155.11586f, 26.63446f, 153.59076f, 26.0014f, 152.0f, 26.0f),
                    PathNode.LineTo(56.0f, 26.0f),
                    PathNode.CurveTo(48.268013f, 26.0f, 42.0f, 32.268013f, 42.0f, 40.0f),
                    PathNode.LineTo(42.0f, 216.0f),
                    PathNode.CurveTo(42.0f, 223.73198f, 48.268013f, 230.0f, 56.0f, 230.0f),
                    PathNode.LineTo(200.0f, 230.0f),
                    PathNode.CurveTo(207.73198f, 230.0f, 214.0f, 223.73198f, 214.0f, 216.0f),
                    PathNode.LineTo(214.0f, 88.0f),
                    PathNode.CurveTo(213.9986f, 86.40924f, 213.36554f, 84.88415f, 212.24f, 83.76f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 216.0f),
                    PathNode.CurveTo(202.0f, 217.10457f, 201.10457f, 218.0f, 200.0f, 218.0f),
                    PathNode.LineTo(56.0f, 218.0f),
                    PathNode.CurveTo(54.89543f, 218.0f, 54.0f, 217.10457f, 54.0f, 216.0f),
                    PathNode.LineTo(54.0f, 40.0f),
                    PathNode.CurveTo(54.0f, 38.89543f, 54.89543f, 38.0f, 56.0f, 38.0f),
                    PathNode.LineTo(149.52f, 38.0f),
                    PathNode.LineTo(202.0f, 90.49f),
                    PathNode.Close,
                    PathNode.MoveTo(74.0f, 120.0f),
                    PathNode.LineTo(74.0f, 192.0f),
                    PathNode.CurveTo(74.0f, 195.3137f, 76.686295f, 198.0f, 80.0f, 198.0f),
                    PathNode.LineTo(176.0f, 198.0f),
                    PathNode.CurveTo(179.3137f, 198.0f, 182.0f, 195.3137f, 182.0f, 192.0f),
                    PathNode.LineTo(182.0f, 120.0f),
                    PathNode.CurveTo(182.0f, 116.686295f, 179.3137f, 114.0f, 176.0f, 114.0f),
                    PathNode.LineTo(80.0f, 114.0f),
                    PathNode.CurveTo(76.686295f, 114.0f, 74.0f, 116.686295f, 74.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 126.0f),
                    PathNode.LineTo(170.0f, 126.0f),
                    PathNode.LineTo(170.0f, 186.0f),
                    PathNode.LineTo(150.0f, 186.0f),
                    PathNode.LineTo(150.0f, 152.0f),
                    PathNode.CurveTo(150.0f, 148.6863f, 147.3137f, 146.0f, 144.0f, 146.0f),
                    PathNode.CurveTo(140.6863f, 146.0f, 138.0f, 148.6863f, 138.0f, 152.0f),
                    PathNode.LineTo(138.0f, 186.0f),
                    PathNode.LineTo(118.0f, 186.0f),
                    PathNode.LineTo(118.0f, 152.0f),
                    PathNode.CurveTo(118.0f, 148.6863f, 115.313705f, 146.0f, 112.0f, 146.0f),
                    PathNode.CurveTo(108.686295f, 146.0f, 106.0f, 148.6863f, 106.0f, 152.0f),
                    PathNode.LineTo(106.0f, 186.0f),
                    PathNode.LineTo(86.0f, 186.0f),
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
        return _simCard!!
    }

private var _simCard: ImageVector? = null
