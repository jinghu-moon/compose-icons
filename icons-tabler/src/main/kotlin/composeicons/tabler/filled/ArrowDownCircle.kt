package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowDownCircle: ImageVector
    get() {
        if (_arrowDownCircle != null) return _arrowDownCircle!!
        _arrowDownCircle = tablerFilledIcon(
            name = "ArrowDownCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(13.46174f, 1.999209f, 14.711267f, 3.052049f, 14.958427f, 4.492742f),
                    PathNode.CurveTo(15.205586f, 5.933436f, 14.378422f, 7.342544f, 13.0f, 7.829f),
                    PathNode.LineTo(13.0f, 18.584f),
                    PathNode.LineTo(14.293f, 17.293f),
                    PathNode.CurveTo(14.649268f, 16.936766f, 15.214914f, 16.901197f, 15.613f, 17.21f),
                    PathNode.LineTo(15.707f, 17.293f),
                    PathNode.CurveTo(16.097382f, 17.6835f, 16.097382f, 18.3165f, 15.707f, 18.707f),
                    PathNode.LineTo(12.707f, 21.707f),
                    PathNode.CurveTo(12.672116f, 21.742058f, 12.634681f, 21.77448f, 12.595f, 21.804f),
                    PathNode.LineTo(12.485f, 21.875f),
                    PathNode.LineTo(12.371f, 21.929f),
                    PathNode.LineTo(12.266f, 21.964f),
                    PathNode.LineTo(12.117f, 21.994f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(11.925f, 21.997f),
                    PathNode.LineTo(11.799f, 21.98f),
                    PathNode.LineTo(11.688f, 21.95f),
                    PathNode.LineTo(11.577f, 21.906f),
                    PathNode.LineTo(11.479f, 21.854f),
                    PathNode.LineTo(11.383f, 21.787f),
                    PathNode.LineTo(11.293f, 21.707f),
                    PathNode.LineTo(8.293f, 18.707f),
                    PathNode.CurveTo(7.914028f, 18.31462f, 7.919448f, 17.690916f, 8.305182f, 17.305182f),
                    PathNode.CurveTo(8.690915f, 16.919447f, 9.314621f, 16.914028f, 9.707f, 17.293f),
                    PathNode.LineTo(11.0f, 18.586f),
                    PathNode.LineTo(11.0f, 7.829f),
                    PathNode.CurveTo(9.624134f, 7.340446f, 8.799531f, 5.932579f, 9.046402f, 4.493571f),
                    PathNode.CurveTo(9.293272f, 3.054562f, 10.53997f, 2.002039f, 12.0f, 2.0f)
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
        return _arrowDownCircle!!
    }

private var _arrowDownCircle: ImageVector? = null
