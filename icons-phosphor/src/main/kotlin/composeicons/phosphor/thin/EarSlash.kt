package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EarSlash: ImageVector
    get() {
        if (_earSlash != null) return _earSlash!!
        _earSlash = phosphorThinIcon(
            name = "EarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L58.23 57.2C48.914 71.027 43.958 87.328 44 104c0 31.79 11.28 42.68 21.24 52.28C73.16 163.91 80 170.51 80 188c.028 26.498 21.502 47.972 48 48 13.71 0 25.52-5.87 35.08-17.45 1.338-1.706 1.074-4.167-.596-5.55-1.67-1.383-4.138-1.183-5.564 .45C148.83 223.24 139.37 228 128 228 105.909 228 88 210.091 88 188 88 167.11 79.25 158.67 70.79 150.52 61.55 141.61 52 132.4 52 104 51.965 89.594 56.06 75.48 63.8 63.33L86.8 88.6C84.948 93.523 84 98.74 84 104c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4-.006-2.873 .329-5.736 1-8.53L141.65 149c-1.101 3.563-1.657 7.271-1.65 11 .005 6.791 3.454 13.115 9.161 16.795 5.707 3.68 12.891 4.213 19.079 1.415L205 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM160 172c-6.627 0-12-5.373-12-12-.001-1.267 .079-2.533 .24-3.79l14.13 15.55c-.78 .156-1.574 .236-2.37 .24ZM83.55 37.36c-.547-.91-.709-1.999-.452-3.029 .257-1.03 .913-1.915 1.822-2.461 25.958-15.507 58.248-15.867 84.544-.941C195.761 45.855 212.007 73.763 212 104c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C204.011 76.635 189.309 51.377 165.51 37.872 141.71 24.366 112.487 24.698 89 38.74c-1.888 1.109-4.317 .494-5.45-1.38ZM160.44 118.17c2.342-4.356 3.565-9.225 3.56-14.17 .002-11.628-5.612-22.542-15.074-29.301-9.462-6.759-21.606-8.532-32.606-4.759-2.09 .715-4.365-.4-5.08-2.49-.715-2.09 .4-4.365 2.49-5.08 13.443-4.609 28.285-2.441 39.848 5.82C165.141 76.451 172.003 89.789 172 104c-.004 6.222-1.535 12.348-4.46 17.84-.686 1.323-2.05 2.156-3.54 2.16-.638 .003-1.266-.152-1.83-.45-1.962-1.009-2.736-3.416-1.73-5.38Z"),
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
        return _earSlash!!
    }

private var _earSlash: ImageVector? = null
