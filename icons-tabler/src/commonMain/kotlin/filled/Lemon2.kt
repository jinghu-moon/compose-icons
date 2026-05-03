package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lemon2: ImageVector
    get() {
        if (_lemon2 != null) return _lemon2!!
        _lemon2 = tablerFilledIcon(
            name = "Lemon2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.CurveTo(19.123487f, 2.999785f, 20.152931f, 3.627324f, 20.667465f, 4.626063f),
                    PathNode.CurveTo(21.182f, 5.624802f, 21.095371f, 6.827323f, 20.443f, 7.742f),
                    PathNode.LineTo(20.383f, 7.818f),
                    PathNode.LineTo(20.42f, 7.905f),
                    PathNode.CurveTo(21.689f, 11.092f, 20.848f, 14.989f, 18.217f, 17.777f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.CurveTo(15.2f, 20.8f, 11.177f, 21.723f, 7.905f, 20.42f),
                    PathNode.LineTo(7.818f, 20.384f),
                    PathNode.LineTo(7.685f, 20.482f),
                    PathNode.CurveTo(7.066964f, 20.901716f, 6.314562f, 21.075731f, 5.575f, 20.97f),
                    PathNode.LineTo(5.37f, 20.934f),
                    PathNode.CurveTo(4.393875f, 20.724703f, 3.585812f, 20.043554f, 3.214358f, 19.116922f),
                    PathNode.CurveTo(2.842902f, 18.19029f, 2.956726f, 17.13959f, 3.518f, 16.314f),
                    PathNode.LineTo(3.616f, 16.18f),
                    PathNode.LineTo(3.58f, 16.095f),
                    PathNode.CurveTo(2.311f, 12.908f, 3.152f, 9.011f, 5.783f, 6.223f),
                    PathNode.LineTo(6.0f, 6.0f),
                    PathNode.CurveTo(8.8f, 3.2f, 12.823f, 2.277f, 16.095f, 3.58f),
                    PathNode.LineTo(16.18f, 3.617f),
                    PathNode.LineTo(16.304f, 3.526f),
                    PathNode.CurveTo(16.746222f, 3.222294f, 17.261791f, 3.042725f, 17.797f, 3.006f),
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
        return _lemon2!!
    }

private var _lemon2: ImageVector? = null
