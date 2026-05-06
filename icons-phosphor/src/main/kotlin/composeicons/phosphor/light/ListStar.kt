package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListStar: ImageVector
    get() {
        if (_listStar != null) return _listStar!!
        _listStar = phosphorLightIcon(
            name = "ListStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M34 64c0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-176c-3.314 0-6-2.686-6-6ZM40 134h56c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-56c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM112 186h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM235.82 142.24l-23.49 19.39 7.16 28.93c.58 2.345-.303 4.808-2.239 6.251-1.937 1.443-4.55 1.584-6.631 .359L184 181.5l-26.62 15.67c-2.081 1.226-4.694 1.085-6.631-.359-1.937-1.443-2.819-3.907-2.239-6.251l7.16-28.93L132.18 142.24c-1.888-1.558-2.64-4.106-1.901-6.439 .739-2.333 2.821-3.984 5.261-4.171l31-2.4 11.91-27.61c.954-2.188 3.113-3.602 5.5-3.602 2.387 0 4.546 1.414 5.5 3.602l11.91 27.61 31 2.4c2.44 .187 4.522 1.838 5.261 4.171 .739 2.333-.013 4.881-1.901 6.439ZM216.72 142.45l-19.83-1.53c-2.205-.189-4.127-1.577-5-3.61L184 119.14l-7.84 18.17c-.873 2.033-2.795 3.421-5 3.61l-19.83 1.53 14.94 12.33c1.778 1.47 2.556 3.83 2 6.07l-4.63 18.74L181 169.37c1.877-1.103 4.203-1.103 6.08 0l17.37 10.22-4.63-18.74c-.556-2.24 .222-4.6 2-6.07Z"),
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
        return _listStar!!
    }

private var _listStar: ImageVector? = null
