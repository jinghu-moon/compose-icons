package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ironing2: ImageVector
    get() {
        if (_ironing2 != null) return _ironing2!!
        _ironing2 = tablerFilledIcon(
            name = "Ironing2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.459f, 5.0f),
                    PathNode.CurveTo(18.41433f, 5.00033f, 20.082836f, 6.414226f, 20.404f, 8.343001f),
                    PathNode.LineTo(21.791f, 16.672f),
                    PathNode.CurveTo(21.887339f, 17.251474f, 21.724052f, 17.844002f, 21.344479f, 18.292326f),
                    PathNode.CurveTo(20.964905f, 18.74065f, 20.407427f, 18.999435f, 19.82f, 19.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(2.447715f, 19.0f, 2.0f, 18.552284f, 2.0f, 18.0f),
                    PathNode.CurveTo(2.0f, 13.581722f, 5.581722f, 10.0f, 10.0f, 10.0f),
                    PathNode.LineTo(18.652f, 10.0f),
                    PathNode.LineTo(18.432f, 8.671f),
                    PathNode.CurveTo(18.281412f, 7.766461f, 17.53498f, 7.080206f, 16.621f, 7.006f),
                    PathNode.LineTo(16.459f, 7.0f),
                    PathNode.LineTo(9.0f, 7.0f),
                    PathNode.CurveTo(8.447715f, 7.0f, 8.0f, 6.552285f, 8.0f, 6.0f),
                    PathNode.CurveTo(8.0f, 5.447716f, 8.447715f, 5.0f, 9.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(10.01f, 14.0f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.CurveTo(9.470906f, 14.000587f, 9.033835f, 14.413211f, 9.002828f, 14.941395f),
                    PathNode.CurveTo(8.971821f, 15.469579f, 9.35761f, 15.93051f, 9.883f, 15.993f),
                    PathNode.LineTo(10.01f, 16.0f),
                    PathNode.CurveTo(10.562284f, 16.0f, 11.01f, 15.552285f, 11.01f, 15.0f),
                    PathNode.CurveTo(11.01f, 14.447715f, 10.562284f, 14.0f, 10.01f, 14.0f),
                    PathNode.MoveTo(14.01f, 14.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.CurveTo(13.470906f, 14.000587f, 13.033835f, 14.413211f, 13.002828f, 14.941395f),
                    PathNode.CurveTo(12.971821f, 15.469579f, 13.35761f, 15.93051f, 13.883f, 15.993f),
                    PathNode.LineTo(14.01f, 16.0f),
                    PathNode.CurveTo(14.562284f, 16.0f, 15.01f, 15.552285f, 15.01f, 15.0f),
                    PathNode.CurveTo(15.01f, 14.447715f, 14.562284f, 14.0f, 14.01f, 14.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _ironing2!!
    }

private var _ironing2: ImageVector? = null
