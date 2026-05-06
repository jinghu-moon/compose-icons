package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Biohazard: ImageVector
    get() {
        if (_biohazard != null) return _biohazard!!
        _biohazard = phosphorRegularIcon(
            name = "Biohazard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M185.68 104.28q-1.4-2.88-3.06-5.6c13.166-29.023 1.345-63.276-26.92-78-3.918-2.043-8.752-.523-10.795 3.395-2.043 3.918-.523 8.752 3.395 10.795 18 9.366 27.261 29.825 22.42 49.53-24.288-21.874-61.172-21.874-85.46 0C80.422 64.691 89.693 44.229 107.7 34.87c3.918-2.043 5.438-6.877 3.395-10.795-2.043-3.918-6.877-5.438-10.795-3.395C72.031 35.401 60.205 69.654 73.37 98.68c-1.111 1.807-2.129 3.67-3.05 5.58C39.534 107.22 16.028 133.072 16 164c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 .029-20.013 13.533-37.496 32.89-42.58-5.317 31.57 13.533 62.206 44.11 71.69-14.336 16.255-38.374 19.65-56.65 8-2.407-1.65-5.522-1.858-8.127-.543-2.605 1.315-4.288 3.944-4.39 6.861-.103 2.917 1.391 5.657 3.898 7.152 13.461 8.584 29.787 11.45 45.367 7.963 15.579-3.487 29.127-13.039 37.643-26.543h1.26 1.26c8.516 13.516 22.07 23.078 37.659 26.568 15.589 3.489 31.926 .618 45.391-7.978 2.506-1.495 4-4.236 3.898-7.152-.103-2.917-1.785-5.546-4.39-6.861-2.605-1.315-5.72-1.107-8.127 .543-18.276 11.65-42.314 8.255-56.65-8 30.561-9.5 49.392-40.132 44.07-71.69 19.353 5.083 32.857 22.561 32.89 42.57 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8-.038-30.92-23.542-56.76-54.32-59.72ZM128 84c13.553-.003 26.474 5.734 35.56 15.79-8.281 11.369-21.499 18.094-35.565 18.094-14.066 0-27.284-6.725-35.565-18.094C101.517 89.729 114.443 83.991 128 84ZM128.12 133.92l-.12 .2-.12-.2h.24ZM80 132c-.003-3.928 .481-7.841 1.44-11.65 13.247 1.65 25.029 9.224 32.029 20.591 7 11.367 8.461 25.297 3.971 37.869C95.569 173.851 80.033 154.427 80 132ZM138.57 178.81c-4.489-12.572-3.029-26.502 3.971-37.869 7-11.367 18.782-18.941 32.029-20.591 3.133 12.536 1.079 25.805-5.696 36.807-6.775 11.002-17.7 18.808-30.304 21.653Z"),
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
        return _biohazard!!
    }

private var _biohazard: ImageVector? = null
