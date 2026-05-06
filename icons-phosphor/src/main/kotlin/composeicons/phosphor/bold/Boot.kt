package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Boot: ImageVector
    get() {
        if (_boot != null) return _boot!!
        _boot = phosphorBoldIcon(
            name = "Boot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 104h-28v-48C164 44.954 155.046 36 144 36h-112c-3.952 .001-7.649 1.947-9.887 5.204-2.238 3.257-2.729 7.407-1.313 11.096 10.88 28.39 8.3 78.36-.33 108.38-.311 1.079-.469 2.197-.47 3.32v36c0 11.046 8.954 20 20 20h26.11c3.123 .003 6.204-.719 9-2.11L86.83 212h14.34l11.77 5.89c2.796 1.391 5.877 2.113 9 2.11h28.22c3.106-.004 6.169-.727 8.95-2.11L170.83 212h14.34l11.77 5.89c2.781 1.383 5.844 2.106 8.95 2.11h26.11c11.046 0 20-8.954 20-20v-36c-.039-33.121-26.879-59.961-60-60ZM48 60h92v44h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h76c15.249 .021 28.837 9.63 33.94 24h-178.73C52.75 124.08 54.23 88.41 48 60ZM228 196h-21.17l-11.77-5.89c-2.781-1.383-5.844-2.106-8.95-2.11h-16.22c-3.106 .004-6.169 .727-8.95 2.11L149.17 196h-26.34l-11.77-5.89c-2.796-1.391-5.877-2.113-9-2.11h-16.17c-3.123-.003-6.204 .719-9 2.11L65.17 196h-21.17v-20h184Z"),
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
        return _boot!!
    }

private var _boot: ImageVector? = null
