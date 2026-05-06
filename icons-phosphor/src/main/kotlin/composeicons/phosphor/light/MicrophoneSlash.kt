package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) return _microphoneSlash!!
        _microphoneSlash = phosphorLightIcon(
            name = "MicrophoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.44 220 52.44 44c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L82 94.32v33.68c-.002 16.141 8.457 31.103 22.289 39.423 13.832 8.32 31.013 8.782 45.271 1.217l13.75 15.12C152.765 190.487 140.508 194.041 128 194 91.567 193.956 62.044 164.433 62 128c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6 .053 40.727 31.397 74.574 72 77.75v34.25c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-34.23c13.415-.982 26.338-5.465 37.48-13L203.56 228c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM128 162C109.222 162 94 146.778 94 128v-20.48l47.12 51.84c-4.154 1.745-8.614 2.643-13.12 2.64ZM187.32 157c4.426-9.025 6.712-18.948 6.68-29 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 .031 11.872-2.673 23.591-7.9 34.25-.884 2.015-2.8 3.385-4.993 3.569-2.193 .184-4.311-.847-5.518-2.687-1.207-1.84-1.31-4.193-.269-6.132ZM85.8 45.67C94.479 25.665 116.01 14.503 137.36 18.94 158.71 23.377 174.011 42.194 174 64v64c.002 1.607-.081 3.212-.25 4.81-.319 3.069-2.914 5.397-6 5.38q-.31 0-.63 0c-3.294-.346-5.684-3.296-5.34-6.59 .134-1.195 .208-2.397 .22-3.6v-64C162.018 47.874 150.707 33.954 134.918 30.673 119.13 27.392 103.208 35.652 96.8 50.45c-1.386 2.926-4.844 4.225-7.814 2.934C86.017 52.094 84.607 48.68 85.8 45.67Z"),
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
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
