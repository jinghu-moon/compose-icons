package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) return _wechatLogo!!
        _wechatLogo = phosphorDuotoneIcon(
            name = "WechatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M163.94 80.11h0C162.63 80 161.32 80 160 80c-23.352-.002-45.255 11.322-58.755 30.377-13.5 19.055-16.92 43.473-9.175 65.503h0c-10.495-.559-20.738-3.423-30-8.39l-27.76 8.16c-2.808 .825-5.842 .05-7.911-2.019-2.069-2.069-2.844-5.103-2.019-7.911L32.5 138C19.875 114.17 21.626 85.283 37.035 63.152 52.445 41.021 78.929 29.356 105.659 32.928c26.73 3.572 49.223 21.781 58.281 47.182Z"),
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
                pathData = parseSvgPathData("M144 140c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM188 128c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM239.34 211.47c1.656 5.619 .108 11.694-4.034 15.836-4.142 4.142-10.217 5.69-15.836 4.034l-24.71-7.27c-19.685 9.494-42.397 10.521-62.859 2.843C111.44 219.235 95.01 203.52 86.43 183.42c-8.748-1.029-17.262-3.513-25.19-7.35l-24.71 7.27c-5.619 1.656-11.694 .108-15.836-4.034-4.142-4.142-5.69-10.217-4.034-15.836l7.27-24.71C11.52 112.649 14.163 81.874 30.844 58.261 47.524 34.649 75.646 21.873 104.403 24.843c28.757 2.97 53.674 21.224 65.177 47.747 25.637 3.089 48.207 18.364 60.605 41.015 12.398 22.652 13.1 49.895 1.885 73.155ZM81.3 166.3c-4-21.909 1.321-44.493 14.681-62.312C109.341 86.169 129.528 74.731 151.68 72.43 134.625 41.466 95.699 30.19 64.735 47.245 33.771 64.3 22.495 103.226 39.55 134.19c.985 1.841 1.211 3.994 .63 6L32 168l27.76-8.17c2.006-.581 4.159-.355 6 .63 4.902 2.619 10.127 4.582 15.54 5.84ZM216.45 182.19c14.958-27.973 7.168-62.682-18.309-81.581C172.663 81.711 137.187 84.327 114.757 106.757c-22.43 22.43-25.046 57.906-6.147 83.384 18.898 25.477 53.607 33.267 81.581 18.309 1.841-.985 3.994-1.211 6-.63L224 216l-8.17-27.76c-.598-2.02-.375-4.194 .62-6.05Z"),
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
        return _wechatLogo!!
    }

private var _wechatLogo: ImageVector? = null
