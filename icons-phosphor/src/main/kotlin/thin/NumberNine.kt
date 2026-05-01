package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorThinIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(106.31181f, 43.994106f, 86.8976f, 57.449627f, 79.28993f, 77.75975f),
                    PathNode.CurveTo(71.68229f, 98.06988f, 77.479065f, 120.968796f, 93.83399f, 135.21288f),
                    PathNode.CurveTo(110.18892f, 149.45695f, 133.6669f, 152.05446f, 152.74f, 141.73f),
                    PathNode.LineTo(116.51f, 206.0f),
                    PathNode.CurveTo(115.42752f, 207.933f, 116.117004f, 210.37752f, 118.05f, 211.46f),
                    PathNode.CurveTo(119.982994f, 212.54248f, 122.42752f, 211.853f, 123.51f, 209.92f),
                    PathNode.LineTo(173.0f, 122.0f),
                    PathNode.CurveTo(182.28593f, 105.9163f, 182.28911f, 86.1011f, 173.00833f, 70.01442f),
                    PathNode.CurveTo(163.72755f, 53.927746f, 146.57185f, 44.0119f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(103.69947f, 140.0f, 84.0f, 120.30053f, 84.0f, 96.0f),
                    PathNode.CurveTo(84.0f, 71.69947f, 103.69947f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(152.30052f, 52.0f, 172.0f, 71.69947f, 172.0f, 96.0f),
                    PathNode.CurveTo(171.97244f, 120.28911f, 152.28911f, 139.97244f, 128.0f, 140.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
