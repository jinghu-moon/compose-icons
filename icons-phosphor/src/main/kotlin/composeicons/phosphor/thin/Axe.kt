package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = phosphorThinIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251.36 99c-1.463-4.365-5.294-7.508-9.86-8.09C221.009 88.128 201.379 80.877 184 69.67L197.86 55.8c7.495-8.299 7.171-21.016-.736-28.924-7.907-7.907-20.624-8.231-28.924-.736L152 42.39c-2.66-2.949-5.154-6.044-7.47-9.27-2.034-2.898-5.244-4.75-8.77-5.061-3.527-.31-7.011 .952-9.52 3.451L87.51 70.18c-2.502 2.509-3.767 5.995-3.457 9.525 .311 3.53 2.165 6.741 5.067 8.775 3.227 2.333 6.322 4.843 9.27 7.52L10.14 184.2c-7.495 8.299-7.171 21.016 .736 28.924 7.907 7.907 20.624 8.231 28.924 .736L125.67 128c11.214 17.383 18.465 37.021 21.24 57.52 .571 4.543 3.678 8.365 8.008 9.852 4.33 1.487 9.13 .381 12.372-2.852l81.19-81.19c3.251-3.215 4.37-8.008 2.88-12.33ZM173.86 31.8c3.189-3.669 8.159-5.252 12.883-4.103 4.724 1.149 8.412 4.837 9.56 9.56 1.149 4.724-.434 9.693-4.103 12.883l-15 15C170.14 60.072 163.514 54.426 157.39 48.26ZM34.14 208.2c-3.189 3.669-8.159 5.252-12.883 4.103-4.724-1.149-8.412-4.837-9.56-9.56-1.149-4.724 .434-9.693 4.103-12.883l88.43-88.43c6.166 6.124 11.812 12.75 16.88 19.81ZM242.82 105.64l-81.18 81.18c-1.044 1.109-2.642 1.501-4.08 1-1.48-.488-2.541-1.792-2.72-3.34C146.3 120.51 99.07 85.69 93.72 81.93 92.74 81.257 92.109 80.184 92 79c-.113-1.168 .305-2.325 1.14-3.15L131.82 37.17c.74-.746 1.749-1.164 2.8-1.16h.35c1.184 .102 2.261 .725 2.94 1.7 3.76 5.35 38.58 52.58 102.52 61.11 1.547 .184 2.846 1.249 3.33 2.73 .52 1.429 .152 3.031-.94 4.09Z"),
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
        return _axe!!
    }

private var _axe: ImageVector? = null
