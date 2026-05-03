package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorFillIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(95.89f, 48.0f),
                    PathNode.CurveTo(95.89f, 30.326887f, 110.21689f, 16.0f, 127.89f, 16.0f),
                    PathNode.CurveTo(145.56311f, 16.0f, 159.89f, 30.326887f, 159.89f, 48.0f),
                    PathNode.CurveTo(159.89f, 65.67311f, 145.56311f, 80.0f, 127.89f, 80.0f),
                    PathNode.CurveTo(110.21689f, 80.0f, 95.89f, 65.67311f, 95.89f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.12f, 121.14f),
                    PathNode.CurveTo(226.4f, 120.11f, 185.55f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(70.45f, 96.0f, 29.6f, 120.11f, 27.88f, 121.14f),
                    PathNode.CurveTo(24.091326f, 123.41541f, 22.864588f, 128.33133f, 25.14f, 132.12f),
                    PathNode.CurveTo(27.415413f, 135.90868f, 32.331326f, 137.1354f, 36.12f, 134.86f),
                    PathNode.CurveTo(36.48f, 134.64f, 71.03f, 114.26f, 120.0f, 112.18f),
                    PathNode.LineTo(120.0f, 149.0f),
                    PathNode.LineTo(58.0f, 218.69f),
                    PathNode.CurveTo(55.067368f, 222.00371f, 55.376293f, 227.06737f, 58.69f, 230.0f),
                    PathNode.CurveTo(62.003708f, 232.93263f, 67.06737f, 232.6237f, 70.0f, 229.31f),
                    PathNode.LineTo(128.0f, 164.0f),
                    PathNode.LineTo(186.0f, 229.27f),
                    PathNode.CurveTo(188.93263f, 232.58371f, 193.99629f, 232.89264f, 197.31f, 229.96f),
                    PathNode.CurveTo(200.6237f, 227.02737f, 200.93263f, 221.96371f, 198.0f, 218.65f),
                    PathNode.LineTo(136.0f, 149.0f),
                    PathNode.LineTo(136.0f, 112.19f),
                    PathNode.CurveTo(184.77f, 114.27f, 219.53f, 134.65f, 219.88f, 134.86f),
                    PathNode.CurveTo(223.66867f, 137.1354f, 228.58458f, 135.90868f, 230.86f, 132.12f),
                    PathNode.CurveTo(233.1354f, 128.33133f, 231.90868f, 123.41541f, 228.12f, 121.14f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
