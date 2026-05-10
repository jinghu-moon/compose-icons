package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandWaving: ImageVector
    get() {
        if (_handWaving != null) return _handWaving!!
        _handWaving = phosphorFillIcon(
            name = "HandWaving",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.31 98.46c16.171 27.217 16.475 61.022 .799 88.526-15.677 27.504-44.919 44.468-76.577 44.423C111.873 231.364 82.679 214.318 67.08 186.77h0L26.15 115.88C22.103 108.271 24.81 98.825 32.271 94.513c7.462-4.312 16.998-1.939 21.569 5.367L72.4 132c2.209 3.827 7.103 5.139 10.93 2.93 3.827-2.209 5.139-7.103 2.93-10.93L47 56C42.953 48.391 45.66 38.945 53.121 34.633 60.583 30.322 70.119 32.694 74.69 40L114 108c1.388 2.556 4.053 4.157 6.962 4.182 2.908 .025 5.601-1.53 7.032-4.062 1.432-2.532 1.376-5.641-.144-8.12l-30-52C93.564 40.361 96.217 30.695 103.803 26.315c7.586-4.38 17.284-1.846 21.757 5.685L166 102.12c-8.942 9.012-13.972 21.185-14 33.88-.03 10.391 3.342 20.505 9.6 28.8 1.698 2.336 4.524 3.576 7.393 3.243 2.869-.333 5.336-2.186 6.454-4.849 1.118-2.663 .714-5.722-1.057-8.003-5.111-6.824-7.288-15.406-6.047-23.841 1.241-8.435 5.797-16.026 12.657-21.089 3.27-2.419 4.203-6.907 2.17-10.43L171.71 80c-4.286-7.639-1.633-17.305 5.953-21.685 7.586-4.38 17.284-1.846 21.757 5.685l19.89 34.46ZM189.94 41.46c11.322 2.984 20.976 10.382 26.8 20.54l.33 .57c2.209 3.827 7.103 5.139 10.93 2.93 3.827-2.209 5.139-7.103 2.93-10.93L230.6 54C222.658 40.153 209.496 30.067 194.06 26c-4.255-1.1-8.601 1.438-9.733 5.685-1.132 4.247 1.375 8.612 5.613 9.775ZM79.58 225.72C69.214 217.539 60.507 207.451 53.93 196 51.721 192.173 46.827 190.861 43 193.07c-3.827 2.209-5.139 7.103-2.93 10.93 7.592 13.208 17.639 24.844 29.6 34.28 3.472 2.671 8.446 2.053 11.159-1.385 2.713-3.439 2.157-8.42-1.249-11.175Z"),
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
        return _handWaving!!
    }

private var _handWaving: ImageVector? = null
