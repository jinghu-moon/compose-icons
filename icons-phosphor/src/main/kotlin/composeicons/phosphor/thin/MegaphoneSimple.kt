package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) return _megaphoneSimple!!
        _megaphoneSimple = phosphorThinIcon(
            name = "MegaphoneSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.41 90.5 51.41 36.5c-3.629-1.076-7.553-.376-10.587 1.888C37.789 40.652 36.002 44.215 36 48v144c0 6.627 5.373 12 12 12 1.168-.004 2.329-.172 3.45-.5L140 176.32v15.68c0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12v-32.86l31.39-9.63c5.093-1.52 8.59-6.195 8.61-11.51v-36c-.002-5.312-3.497-9.99-8.59-11.5ZM49.12 195.84c-1.209 .353-2.513 .115-3.52-.64C44.593 194.445 44 193.259 44 192v-144c0-1.259 .593-2.445 1.6-3.2C46.292 44.281 47.135 44 48 44c.362-0 .722 .05 1.07 .15L140 72.05v95.95ZM188 192c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4v-18.13l40-12.27ZM228 138c0 1.778-1.173 3.342-2.88 3.84h-.05L148 165.5v-91l77.12 23.66c1.707 .498 2.88 2.062 2.88 3.84Z"),
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
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
