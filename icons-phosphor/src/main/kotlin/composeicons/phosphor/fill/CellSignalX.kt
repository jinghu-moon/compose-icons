package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorFillIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 194.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L184 187.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L172.69 176 154.34 157.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L184 164.69l18.34-18.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L195.31 176ZM157.41 120.1c8.739-.707 17.386 2.203 23.92 8.05 1.519 1.362 3.821 1.362 5.34 0 4.943-4.456 11.157-7.253 17.77-8 2.036-.225 3.572-1.952 3.56-4v-75.69c.076-6.331-3.496-12.141-9.18-14.93-6.108-2.88-13.366-1.616-18.14 3.16L20.68 188.69c-4.775 4.77-6.043 12.023-3.17 18.13 2.79 5.692 8.611 9.267 14.95 9.18h93.6c1.292-.001 2.504-.626 3.254-1.677 .75-1.052 .946-2.401 .526-3.623-3.898-11.019-1.479-23.286 6.31-32 1.362-1.519 1.362-3.821 0-5.34-8.101-9.056-10.374-21.92-5.867-33.204 4.507-11.284 15.016-19.042 27.128-20.026Z"),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
