package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Couch: ImageVector
    get() {
        if (_couch != null) return _couch!!
        _couch = phosphorDuotoneIcon(
            name = "Couch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 120v48c0 4.418-3.582 8-8 8h-208c-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8v-40c0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8v40c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M240 106.17v-34.17c0-8.837-7.163-16-16-16h-192C23.163 56 16 63.163 16 72v34.17C11.058 109.023 8.009 114.293 8 120v48c0 8.837 7.163 16 16 16h8v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h160v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h8c8.837 0 16-7.163 16-16v-48c-.009-5.707-3.058-10.977-8-13.83ZM224 104h-8c-8.837 0-16 7.163-16 16v16h-64v-64h88ZM120 72v64h-64v-16c0-8.837-7.163-16-16-16h-8v-32ZM232 168h-208v-48h16v24c0 4.418 3.582 8 8 8h160c4.418 0 8-3.582 8-8v-24h16Z"),
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
        return _couch!!
    }

private var _couch: ImageVector? = null
