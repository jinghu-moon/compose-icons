package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitRight: ImageVector
    get() {
        if (_arrowAutofitRight != null) return _arrowAutofitRight!!
        _arrowAutofitRight = tablerFilledIcon(
            name = "ArrowAutofitRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 14.0f),
                    PathNode.CurveTo(3.0f, 14.552285f, 3.447715f, 15.0f, 4.0f, 15.0f),
                    PathNode.LineTo(15.001f, 15.0f),
                    PathNode.LineTo(15.001f, 14.908f),
                    PathNode.CurveTo(15.037404f, 13.711741f, 15.781341f, 12.651566f, 16.893896f, 12.210454f),
                    PathNode.CurveTo(18.006453f, 11.769343f, 19.274754f, 12.031699f, 20.121f, 12.878f),
                    PathNode.CurveTo(20.268154f, 13.025026f, 20.489311f, 13.06909f, 20.681578f, 12.989689f),
                    PathNode.CurveTo(20.873846f, 12.910288f, 20.999468f, 12.723017f, 21.0f, 12.515f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.CurveTo(21.0f, 4.343146f, 19.656855f, 3.0f, 18.0f, 3.0f),
                    PathNode.LineTo(6.0f, 3.0f),
                    PathNode.CurveTo(4.343146f, 3.0f, 3.0f, 4.343146f, 3.0f, 6.0f),
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
                    PathNode.MoveTo(3.0f, 18.0f),
                    PathNode.CurveTo(3.0f, 18.552284f, 3.447715f, 19.0f, 4.0f, 19.0f),
                    PathNode.LineTo(18.584f, 19.0f),
                    PathNode.LineTo(17.293f, 20.293f),
                    PathNode.CurveTo(16.936766f, 20.64927f, 16.901197f, 21.214914f, 17.21f, 21.613f),
                    PathNode.LineTo(17.293f, 21.707f),
                    PathNode.CurveTo(17.6835f, 22.097382f, 18.3165f, 22.097382f, 18.707f, 21.707f),
                    PathNode.LineTo(21.707f, 18.707f),
                    PathNode.QuadTo(21.761f, 18.654f, 21.804f, 18.595f),
                    PathNode.LineTo(21.875f, 18.485f),
                    PathNode.LineTo(21.929f, 18.371f),
                    PathNode.LineTo(21.964f, 18.266f),
                    PathNode.LineTo(21.994f, 18.117f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.LineTo(21.997f, 17.925f),
                    PathNode.LineTo(21.98f, 17.799f),
                    PathNode.LineTo(21.95f, 17.688f),
                    PathNode.LineTo(21.906f, 17.577f),
                    PathNode.LineTo(21.854f, 17.479f),
                    PathNode.LineTo(21.787f, 17.383f),
                    PathNode.LineTo(21.707f, 17.293f),
                    PathNode.LineTo(18.707f, 14.293f),
                    PathNode.CurveTo(18.31462f, 13.914028f, 17.690916f, 13.919448f, 17.305182f, 14.305182f),
                    PathNode.CurveTo(16.919447f, 14.690915f, 16.914028f, 15.314621f, 17.293f, 15.707f),
                    PathNode.LineTo(18.586f, 17.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.CurveTo(3.447715f, 17.0f, 3.0f, 17.447716f, 3.0f, 18.0f)
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
        return _arrowAutofitRight!!
    }

private var _arrowAutofitRight: ImageVector? = null
