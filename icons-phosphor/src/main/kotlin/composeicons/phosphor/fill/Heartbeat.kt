package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorFillIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 102c0 70-103.79 126.66-108.21 129-2.366 1.273-5.214 1.273-7.58 0C120.86 229.2 60.66 196.31 31.53 150.11c-.765-1.232-.803-2.782-.099-4.051 .704-1.268 2.039-2.056 3.489-2.059h37.08c2.676 .002 5.175-1.334 6.66-3.56l9.34-14 25.34 38c1.996 2.993 5.743 4.286 9.16 3.16 1.763-.597 3.272-1.775 4.28-3.34L140.28 144h19.72c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003-.371-4.265-3.969-7.523-8.25-7.47h-23.75c-2.676-.002-5.175 1.334-6.66 3.56l-9.34 14-25.34-38c-1.997-2.997-5.751-4.291-9.17-3.16-1.759 .601-3.264 1.777-4.27 3.34L67.72 128h-44.19c-1.755 .005-3.308-1.135-3.83-2.81C17.287 117.695 16.039 109.874 16 102 16.039 67.774 43.774 40.039 78 40c20.65 0 38.73 8.88 50 23.89C139.27 48.88 157.35 40 178 40c34.226 .039 61.961 27.774 62 62Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
