package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PencilSlash: ImageVector
    get() {
        if (_pencilSlash != null) return _pencilSlash!!
        _pencilSlash = phosphorFillIcon(
            name = "PencilSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L90.28 98.38 36.68 152c-3.008 2.994-4.693 7.066-4.68 11.31v44.69c0 8.837 7.163 16 16 16h44.69c4.246 .014 8.32-1.676 11.31-4.69l50.4-50.39 47.69 52.46c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM101.06 110.26 117 127.74 68 176.69 51.31 160ZM48 208v-28.69L76.69 208ZM96 204.69 79.32 188l48.41-48.41 15.89 17.48ZM227.32 96 183 140.34c-3.131 3.129-8.206 3.126-11.335-.005-3.129-3.131-3.126-8.206 .005-11.335l14.68-14.68L169.66 97.66 156.31 111c-3.145 2.988-8.099 2.925-11.167-.143-3.068-3.068-3.131-8.022-.143-11.167L158.35 86.34h0L141.66 69.66l-12 12c-3.123 3.126-8.189 3.128-11.315 .005-3.126-3.123-3.128-8.189-.005-11.315L160 28.69c3.001-3.001 7.071-4.688 11.315-4.688 4.244 0 8.314 1.686 11.315 4.688l44.69 44.68c3.001 3.001 4.688 7.071 4.688 11.315 0 4.244-1.686 8.314-4.688 11.315Z"),
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
        return _pencilSlash!!
    }

private var _pencilSlash: ImageVector? = null
