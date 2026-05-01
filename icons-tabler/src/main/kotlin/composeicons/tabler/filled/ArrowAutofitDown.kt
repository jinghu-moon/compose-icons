package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitDown: ImageVector
    get() {
        if (_arrowAutofitDown != null) return _arrowAutofitDown!!
        _arrowAutofitDown = tablerFilledIcon(
            name = "ArrowAutofitDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 3.0f),
                    PathNode.CurveTo(14.552285f, 3.0f, 15.0f, 3.447715f, 15.0f, 4.0f),
                    PathNode.LineTo(15.0f, 15.001f),
                    PathNode.LineTo(14.908f, 15.001f),
                    PathNode.CurveTo(13.711741f, 15.037404f, 12.651566f, 15.781341f, 12.210454f, 16.893896f),
                    PathNode.CurveTo(11.769343f, 18.006453f, 12.031699f, 19.274754f, 12.878f, 20.121f),
                    PathNode.CurveTo(13.025026f, 20.268154f, 13.06909f, 20.489311f, 12.989689f, 20.681578f),
                    PathNode.CurveTo(12.910288f, 20.873846f, 12.723017f, 20.999468f, 12.515f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.343146f, 21.0f, 3.0f, 19.656855f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 4.343146f, 4.343146f, 3.0f, 6.0f, 3.0f),
                    PathNode.Close
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.CurveTo(18.552284f, 3.0f, 19.0f, 3.447715f, 19.0f, 4.0f),
                    PathNode.LineTo(19.0f, 18.584f),
                    PathNode.LineTo(20.293f, 17.293f),
                    PathNode.CurveTo(20.64927f, 16.936766f, 21.214914f, 16.901197f, 21.613f, 17.21f),
                    PathNode.LineTo(21.707f, 17.293f),
                    PathNode.CurveTo(22.097382f, 17.6835f, 22.097382f, 18.3165f, 21.707f, 18.707f),
                    PathNode.LineTo(18.707f, 21.707f),
                    PathNode.CurveTo(18.672117f, 21.742058f, 18.63468f, 21.77448f, 18.595f, 21.804f),
                    PathNode.LineTo(18.485f, 21.875f),
                    PathNode.LineTo(18.371f, 21.929f),
                    PathNode.LineTo(18.266f, 21.964f),
                    PathNode.LineTo(18.117f, 21.994f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.LineTo(17.925f, 21.997f),
                    PathNode.LineTo(17.799f, 21.98f),
                    PathNode.LineTo(17.688f, 21.95f),
                    PathNode.LineTo(17.577f, 21.906f),
                    PathNode.LineTo(17.479f, 21.854f),
                    PathNode.LineTo(17.383f, 21.787f),
                    PathNode.LineTo(17.293f, 21.707f),
                    PathNode.LineTo(14.293f, 18.707f),
                    PathNode.CurveTo(13.914028f, 18.31462f, 13.919448f, 17.690916f, 14.305182f, 17.305182f),
                    PathNode.CurveTo(14.690915f, 16.919447f, 15.314621f, 16.914028f, 15.707f, 17.293f),
                    PathNode.LineTo(17.0f, 18.586f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.CurveTo(17.0f, 3.447715f, 17.447716f, 3.0f, 18.0f, 3.0f)
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
        return _arrowAutofitDown!!
    }

private var _arrowAutofitDown: ImageVector? = null
