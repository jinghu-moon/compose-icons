package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Orange: ImageVector
    get() {
        if (_orange != null) return _orange!!
        _orange = phosphorThinIcon(
            name = "Orange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M155.62 72.69C179.768 64.306 195.968 41.562 196 16c0-2.209-1.791-4-4-4h-8c-24.828 .032-47.08 15.33-56 38.5C119.08 27.33 96.828 12.032 72 12h-8c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h8c27.193 .037 49.777 20.996 51.84 48.11C80.624 70.237 46.094 104.843 44.062 148.064c-2.032 43.221 29.1 80.914 71.925 87.086 42.826 6.172 83.334-21.197 93.589-63.233C219.83 129.881 196.477 86.933 155.62 72.69ZM184 20h3.85C185.727 47.073 163.156 67.968 136 68h-3.85C134.273 40.927 156.844 20.032 184 20ZM128 228C86.026 228 52 193.974 52 152 52 110.026 86.026 76 128 76c41.974 0 76 34.026 76 76-.044 41.955-34.045 75.956-76 76ZM179.94 160.66c-3.898 22.1-21.186 39.411-43.28 43.34-.219 .031-.439 .048-.66 .05-2.092 .016-3.843-1.584-4.017-3.669-.173-2.085 1.29-3.952 3.357-4.281 18.73-3.32 33.395-17.981 36.72-36.71 .17-1.467 1.135-2.722 2.51-3.262 1.375-.54 2.936-.279 4.06 .68 1.124 .959 1.628 2.459 1.31 3.902Z"),
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
        return _orange!!
    }

private var _orange: ImageVector? = null
