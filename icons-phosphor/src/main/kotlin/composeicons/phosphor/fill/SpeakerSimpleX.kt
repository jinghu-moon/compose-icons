package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.addPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerSimpleX: ImageVector
    get() {
        if (_speakerSimpleX != null) return _speakerSimpleX!!
        _speakerSimpleX = phosphorFillIcon(
            name = "SpeakerSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPathData("M163.52 24.81c-2.747-1.342-6.019-1-8.43 .88L85.25 80h-45.25C31.163 80 24 87.163 24 96v64c0 8.837 7.163 16 16 16h45.25l69.84 54.31c1.401 1.098 3.13 1.693 4.91 1.69 4.418 0 8-3.582 8-8v-192c.002-3.056-1.736-5.846-4.48-7.19Z")
            addPathData("M235.31 128l18.35-18.34c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L224 116.69 205.66 98.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L212.69 128l-18.35 18.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L224 139.31l18.34 18.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32Z")
        }
        return _speakerSimpleX!!
    }

private var _speakerSimpleX: ImageVector? = null
