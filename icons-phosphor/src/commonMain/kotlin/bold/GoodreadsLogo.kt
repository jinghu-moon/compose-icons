package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorBoldIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 20.0f),
                    PathNode.CurveTo(177.37259f, 20.0f, 172.0f, 25.372583f, 172.0f, 32.0f),
                    PathNode.LineTo(172.0f, 36.22f),
                    PathNode.CurveTo(151.82256f, 19.029642f, 123.489746f, 15.144113f, 99.42936f, 26.267746f),
                    PathNode.CurveTo(75.368965f, 37.39138f, 59.97508f, 61.4927f, 60.0f, 88.0f),
                    PathNode.LineTo(60.0f, 112.0f),
                    PathNode.CurveTo(59.97508f, 138.5073f, 75.368965f, 162.60861f, 99.42936f, 173.73225f),
                    PathNode.CurveTo(123.489746f, 184.85588f, 151.82256f, 180.97035f, 172.0f, 163.78f),
                    PathNode.LineTo(172.0f, 168.0f),
                    PathNode.CurveTo(171.97244f, 192.28911f, 152.28911f, 211.97244f, 128.0f, 212.0f),
                    PathNode.CurveTo(113.0f, 212.0f, 97.71f, 204.42f, 89.84f, 193.13f),
                    PathNode.CurveTo(86.04581f, 187.69551f, 78.56448f, 186.3658f, 73.13f, 190.16f),
                    PathNode.CurveTo(67.69552f, 193.9542f, 66.36581f, 201.43552f, 70.16f, 206.87f),
                    PathNode.CurveTo(82.5f, 224.56f, 105.21f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(165.53935f, 235.96141f, 195.96141f, 205.53935f, 196.0f, 168.0f),
                    PathNode.LineTo(196.0f, 32.0f),
                    PathNode.CurveTo(196.0f, 25.372583f, 190.62741f, 20.0f, 184.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(103.71089f, 155.97244f, 84.02756f, 136.28911f, 84.0f, 112.0f),
                    PathNode.LineTo(84.0f, 88.0f),
                    PathNode.CurveTo(84.0f, 63.69947f, 103.69947f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(152.30052f, 44.0f, 172.0f, 63.69947f, 172.0f, 88.0f),
                    PathNode.LineTo(172.0f, 112.0f),
                    PathNode.CurveTo(171.97244f, 136.28911f, 152.28911f, 155.97244f, 128.0f, 156.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
