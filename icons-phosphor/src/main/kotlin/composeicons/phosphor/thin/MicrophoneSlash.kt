package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) return _microphoneSlash!!
        _microphoneSlash = phosphorThinIcon(
            name = "MicrophoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211 221.31 51 45.31C49.514 43.653 46.967 43.514 45.31 45c-1.657 1.486-1.796 4.033-.31 5.69L84 93.55v34.45c-.005 15.722 8.379 30.253 21.994 38.116 13.615 7.863 30.39 7.865 44.006 .004l16.38 18C155.097 191.901 141.705 196.046 128 196 90.461 195.961 60.039 165.539 60 128c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4 .048 40.399 31.659 73.718 72 75.89v36.11c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-36.11c14.305-.702 28.111-5.48 39.79-13.77L205 226.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM128 164C108.118 164 92 147.882 92 128v-25.65L144.43 160c-5.079 2.625-10.713 3.997-16.43 4ZM189.12 157.85c4.553-9.291 6.907-19.504 6.88-29.85 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 .031 11.567-2.604 22.986-7.7 33.37-1.01 1.912-3.356 2.676-5.298 1.724-1.942-.952-2.775-3.275-1.882-5.244ZM87.63 46.46C95.928 27.318 116.529 16.635 136.956 20.881 157.383 25.128 172.019 43.136 172 64v64c0 1.54-.08 3.079-.24 4.61-.216 2.044-1.945 3.591-4 3.58h-.42c-1.056-.108-2.025-.632-2.695-1.455-.67-.823-.984-1.879-.875-2.935 .142-1.262 .219-2.53 .23-3.8v-64C163.978 46.959 152.01 32.268 135.325 28.801 118.641 25.333 101.81 34.039 95 49.66c-.884 2.027-3.243 2.954-5.27 2.07-2.027-.884-2.954-3.243-2.07-5.27Z"),
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
