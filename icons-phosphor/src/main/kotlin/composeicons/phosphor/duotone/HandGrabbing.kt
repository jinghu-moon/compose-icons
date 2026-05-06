package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorDuotoneIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 108v44c0 44.183-35.817 80-80 80C83.817 232 48 196.183 48 152v-12c0-11.046 8.954-20 20-20h20v-28C88 80.954 96.954 72 108 72c11.046 0 20 8.954 20 20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v16c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M188 80c-4.668-.007-9.263 1.163-13.36 3.4C171.629 74.073 163.961 66.999 154.421 64.75c-9.539-2.25-19.56 .652-26.421 7.65C120.037 64.273 107.949 61.773 97.415 66.074 86.882 70.375 79.998 80.622 80 92v20h-12c-15.464 0-28 12.536-28 28v12c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88v-44C216 92.536 203.464 80 188 80ZM200 152c0 39.764-32.236 72-72 72C88.235 224 56 191.764 56 152v-12c0-6.627 5.373-12 12-12h12v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-60c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v28c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-28c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v28c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
