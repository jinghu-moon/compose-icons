package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleFour: ImageVector
    get() {
        if (_numberCircleFour != null) return _numberCircleFour!!
        _numberCircleFour = phosphorLightIcon(
            name = "NumberCircleFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 146.0f),
                    PathNode.LineTo(150.0f, 146.0f),
                    PathNode.LineTo(150.0f, 80.0f),
                    PathNode.CurveTo(150.00058f, 77.43536f, 148.37103f, 75.15391f, 145.94487f, 74.32259f),
                    PathNode.CurveTo(143.51869f, 73.49128f, 140.8324f, 74.29394f, 139.26f, 76.32f),
                    PathNode.LineTo(83.26f, 148.32f),
                    PathNode.CurveTo(81.85488f, 150.12946f, 81.60279f, 152.58113f, 82.6103f, 154.63866f),
                    PathNode.CurveTo(83.617805f, 156.69618f, 85.70904f, 158.0004f, 88.0f, 158.0f),
                    PathNode.LineTo(138.0f, 158.0f),
                    PathNode.LineTo(138.0f, 176.0f),
                    PathNode.CurveTo(138.0f, 179.3137f, 140.6863f, 182.0f, 144.0f, 182.0f),
                    PathNode.CurveTo(147.3137f, 182.0f, 150.0f, 179.3137f, 150.0f, 176.0f),
                    PathNode.LineTo(150.0f, 158.0f),
                    PathNode.LineTo(160.0f, 158.0f),
                    PathNode.CurveTo(163.3137f, 158.0f, 166.0f, 155.3137f, 166.0f, 152.0f),
                    PathNode.CurveTo(166.0f, 148.6863f, 163.3137f, 146.0f, 160.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 146.0f),
                    PathNode.LineTo(100.27f, 146.0f),
                    PathNode.LineTo(138.0f, 97.49f),
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
        return _numberCircleFour!!
    }

private var _numberCircleFour: ImageVector? = null
