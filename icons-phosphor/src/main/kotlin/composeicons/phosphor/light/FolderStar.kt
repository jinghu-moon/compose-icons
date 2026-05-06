package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderStar: ImageVector
    get() {
        if (_folderStar != null) return _folderStar!!
        _folderStar = phosphorLightIcon(
            name = "FolderStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 86c1.105 0 2 .895 2 2v32c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32c0-7.732-6.268-14-14-14h-85.52L102.58 46.1C99.963 43.468 96.402 41.991 92.69 42h-52.69C32.268 42 26 48.268 26 56v144.61c-0 7.391 5.989 13.384 13.38 13.39h81.18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-81.18c-.762-.011-1.375-.628-1.38-1.39v-114.61ZM40 54h52.69c.528-0 1.035 .208 1.41 .58L113.52 74h-75.52v-18c0-1.105 .895-2 2-2ZM237.72 159.8c-.739-2.332-2.82-3.983-5.26-4.17l-31-2.4L189.55 125.62c-.954-2.188-3.113-3.602-5.5-3.602-2.387 0-4.546 1.414-5.5 3.602l-11.91 27.61-31 2.4c-2.44 .187-4.522 1.838-5.261 4.171-.739 2.333 .013 4.881 1.901 6.439l23.49 19.39-7.16 28.93c-.58 2.345 .303 4.808 2.239 6.251 1.937 1.443 4.55 1.584 6.631 .359L184 205.5l26.62 15.67c2.081 1.226 4.694 1.085 6.631-.359 1.937-1.443 2.819-3.907 2.239-6.251l-7.16-28.93 23.49-19.39c1.888-1.558 2.64-4.107 1.9-6.44ZM201.78 178.8c-1.778 1.47-2.556 3.83-2 6.07l4.64 18.74L187 193.36c-1.877-1.103-4.203-1.103-6.08 0l-17.37 10.23 4.63-18.74c.556-2.24-.222-4.6-2-6.07L151.24 166.45l19.83-1.53c2.205-.189 4.127-1.577 5-3.61L184 143.14l7.84 18.17c.873 2.033 2.795 3.421 5 3.61l19.83 1.53Z"),
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
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
