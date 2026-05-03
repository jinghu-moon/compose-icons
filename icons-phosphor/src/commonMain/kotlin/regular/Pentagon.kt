package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorRegularIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.56f, 87.56f),
                    PathNode.LineTo(137.64f, 19.25f),
                    PathNode.LineTo(137.46f, 19.11f),
                    PathNode.CurveTo(131.8363f, 14.95922f, 124.1637f, 14.95922f, 118.54f, 19.11f),
                    PathNode.LineTo(118.36f, 19.25f),
                    PathNode.LineTo(30.44f, 87.56f),
                    PathNode.CurveTo(24.984432f, 91.62674f, 22.697832f, 98.69915f, 24.74f, 105.19f),
                    PathNode.LineTo(56.74f, 212.73f),
                    PathNode.LineTo(56.8f, 212.9f),
                    PathNode.CurveTo(58.908302f, 219.51566f, 65.05653f, 224.00548f, 72.0f, 224.0f),
                    PathNode.LineTo(184.0f, 224.0f),
                    PathNode.CurveTo(190.95453f, 224.01857f, 197.11835f, 219.52621f, 199.23f, 212.9f),
                    PathNode.LineTo(199.29f, 212.73f),
                    PathNode.LineTo(231.29f, 105.19f),
                    PathNode.CurveTo(233.32571f, 98.69276f, 231.02661f, 91.61888f, 225.56f, 87.56f),
                    PathNode.Close,
                    PathNode.MoveTo(215.94f, 100.56f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.LineTo(40.0f, 100.56f),
                    PathNode.LineTo(39.94f, 100.39f),
                    PathNode.LineTo(39.94f, 100.39f),
                    PathNode.LineTo(40.12f, 100.25f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.LineTo(215.82f, 100.23f),
                    PathNode.LineTo(216.0f, 100.37f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
