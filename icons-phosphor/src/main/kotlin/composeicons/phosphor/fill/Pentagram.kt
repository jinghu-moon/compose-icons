package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorFillIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60.18 129.52c-.396 1.216-1.35 2.169-2.566 2.565-1.216 .396-2.548 .186-3.584-.565L22.66 109C16.94 104.957 14.57 97.627 16.84 91 19.131 84.363 25.409 79.934 32.43 80h38.31c1.282-.002 2.488 .61 3.242 1.648 .754 1.037 .965 2.373 .568 3.592ZM53.18 203c-2.221 6.591 .145 13.859 5.82 17.88 5.572 4.139 13.198 4.139 18.77 0l32.05-23.06c1.047-.751 1.668-1.961 1.668-3.25 0-1.289-.621-2.499-1.668-3.25L71.38 163.72c-1.035-.746-2.364-.953-3.578-.558-1.213 .395-2.165 1.346-2.562 2.558ZM143.23 19.26C141.184 12.573 135.016 8.003 128.023 7.992c-6.993-.011-13.175 4.539-15.243 11.218L100 58.76c-.395 1.211-.19 2.537 .553 3.572 .743 1.035 1.933 1.654 3.207 1.668h48.48c1.28 .001 2.483-.61 3.237-1.645 .754-1.035 .967-2.367 .573-3.585ZM160 80h-64c-1.733 .003-3.267 1.121-3.8 2.77L73 141.77c-.536 1.654 .058 3.465 1.47 4.48l51.17 36.82c1.397 1.008 3.283 1.008 4.68 0l51.17-36.82c1.412-1.015 2.006-2.826 1.47-4.48L163.81 82.77C163.276 81.117 161.737 79.998 160 80ZM239.13 91C236.839 84.363 230.561 79.934 223.54 80h-38.28c-1.282-.002-2.488 .61-3.242 1.648-.754 1.037-.965 2.373-.568 3.592l14.37 44.29c.397 1.213 1.349 2.163 2.562 2.558 1.213 .395 2.542 .188 3.578-.558l31.41-22.6c5.686-4.036 8.042-11.331 5.79-17.93ZM184.58 163.75l-38.4 27.63c-1.047 .751-1.668 1.961-1.668 3.25 0 1.289 .621 2.499 1.668 3.25l32 23c5.605 4.112 13.225 4.135 18.854 .055 5.629-4.08 7.98-11.328 5.816-17.935L190.76 165.73c-.394-1.218-1.347-2.173-2.563-2.571-1.217-.398-2.55-.189-3.587 .561Z"),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
